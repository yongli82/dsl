package com.avon.hr.accounting;

import com.avon.hr.accounting.function.SummaryAndDouble;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by yangyongli on 10/20/16.
 */
public class MyAccountingExtendTest {
    MyAccounting m = new MyAccounting();


    Map<String, CustomiseFunction> functionMap = new HashMap<String, CustomiseFunction>();


    @Before
    public void setup(){
        SummaryAndDouble summaryAndDouble = new SummaryAndDouble();
        functionMap.put("summaryAndDouble", summaryAndDouble);
        functionMap.put("getBaseRateByArea", new CustomiseFunction() {
            public BigDecimal execute(Object... parameters) {
                String city = (String)parameters[0];
                if("北京".equals(city)){
                    return new BigDecimal("0.06");
                }
                if ("南京".equals(city)){
                    return new BigDecimal("0.12");
                }
                return BigDecimal.ZERO;
            }
        });
    }

    @Test
    public void calculate1() throws Exception {
        String e = "a = summaryAndDouble(1,2,3,4,5,6,7, 8, 9, 10)\n" +
                "return a;";
        BigDecimal result = m.calculate(e, null, functionMap);
        assertEquals(new BigDecimal("110"), result);
    }

    @Test
    public void calculate2() throws Exception {
        String e = "rate = getBaseRateByArea(\"北京\")\n" +
                "return rate;";
        BigDecimal result = m.calculate(e, null, functionMap);
        assertEquals(new BigDecimal("0.06"), result);
    }

    @Test
    public void calculate3() throws Exception {
        String e = "rate = getBaseRateByArea(\"南京\")\n" +
                "return rate;";
        BigDecimal result = m.calculate(e, null, functionMap);
        assertEquals(new BigDecimal("0.12"), result);
    }

    @Test
    public void calculate4() throws Exception {
    	functionMap.put("税率计算", new CustomiseFunction() {
			@Override
			public BigDecimal execute(Object... parameters) {
				String e = "计税金额 = 基本工资 - 社保缴费 - 5000;\n" +
                        "if (计税金额 < 0) {\n" +
                        "    个税 = 0\n" +
                        "} else if (计税金额 < 1500) {\n" +
                        "    个税 = 计税金额 * 0.03\n" +
                        "} else if (计税金额 < 4500) {\n" +
                        "    个税 = 计税金额 * 0.1 - 105;\n" +
                        "} else if (计税金额 < 9000) {\n" +
                        "    个税 = 计税金额 * 0.2 - 555;\n" +
                        "} else if (计税金额 < 35000) {\n" +
                        "    个税 = 计税金额 * 0.25 - 1005;\n" +
                        "} else if (计税金额 < 55000) {\n" +
                        "    个税 = 计税金额 * 0.3 - 2755;\n" +
                        "} else if (计税金额 < 80000) {\n" +
                        "    个税 = 计税金额 * 0.35 - 5505;\n" +
                        "} else {\n" +
                        "    个税 = 计税金额 * 0.45 - 13505;\n" +
                        "} \n" +
                        "return 基本工资 - 社保缴费 - 个税;";
				Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
				map.put("基本工资", new BigDecimal("10000"));
		        map.put("社保缴费", new BigDecimal("200"));
                BigDecimal result = m.calculate(e, map);
                return result;
			}
        });
    	String e = "税率 = 税率计算()\n return 税率";
    	BigDecimal result = m.calculate(e, null, functionMap);
    	System.out.println(result);
    }
}
