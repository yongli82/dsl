package com.avon.hr.expression.accounting;

import com.avon.hr.expression.accounting.function.SummaryAndDouble;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

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
    }

    @Test
    public void calculate1() throws Exception {
        String e = "a = summaryAndDouble(1,2,3,4,5,6,7, 8, 9, 10)\n" +
                "return a;";
        BigDecimal result = m.calculate(e, null, functionMap);
        assertEquals(new BigDecimal("110"), result);
    }
}
