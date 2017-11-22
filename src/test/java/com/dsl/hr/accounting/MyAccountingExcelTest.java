package com.dsl.hr.accounting;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by yangyongli on 12/11/2017.
 */
public class MyAccountingExcelTest {
    MyAccounting m = new MyAccounting();


    Map<String, CustomiseFunction> functionMap = new HashMap<String, CustomiseFunction>();
    Map<String, BigDecimal> variables = new HashMap<>();

    @Before
    public void setup(){
        functionMap.put("ROUND", new CustomiseFunction() {
            public BigDecimal execute(Object... parameters) {
                if(parameters == null || parameters.length != 2){
                    throw new IllegalArgumentException("ROUND 函数需要两个参数，第一个参数是原始值，第二个参数是位数");
                }
                BigDecimal value = (BigDecimal)parameters[0];
                Integer scale = ((BigDecimal)parameters[1]).intValue();
                BigDecimal result = value.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
                return result;
            }
        });

        functionMap.put("IF", new CustomiseFunction() {
            public BigDecimal execute(Object... parameters) {
                if(parameters == null || parameters.length != 3){
                    throw new IllegalArgumentException("IF 函数需要3个参数，第一个参数是判断值，第二个参数是判断值为true的取值，第三个参数是判断值为false的取值");
                }
                BigDecimal judgeParam = (BigDecimal)parameters[0];
                BigDecimal trueValue = (BigDecimal)parameters[1];
                BigDecimal falseValue = (BigDecimal)parameters[2];
                if(judgeParam.compareTo(BigDecimal.ZERO) > 0){
                    return trueValue;
                }else{
                    return falseValue;
                }
            }
        });


        variables.put("true", BigDecimal.ONE);
        variables.put("false", BigDecimal.ZERO);
    }

    @Test
    public void calculate1() throws Exception {
        String e = "=ROUND(12.34567, 2)";
        BigDecimal result = m.calculate(e, variables, functionMap);
        assertEquals(new BigDecimal("12.35"), result);
    }

    @Test
    public void calculate2() throws Exception {
        String e = "=IF(true, 2, 3)";
        BigDecimal result = m.calculate(e, variables, functionMap);
        assertEquals(new BigDecimal("2"), result);
    }

    @Test
    public void calculate3() throws Exception {
        String e = "=IF(3 > 20, 3.22 + 4.55, 10 * 100)";
        BigDecimal result = m.calculate(e, variables, functionMap);
        assertEquals(new BigDecimal("1000"), result);
    }
}
