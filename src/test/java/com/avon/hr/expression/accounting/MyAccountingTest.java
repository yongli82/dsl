package com.avon.hr.expression.accounting;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by yangyongli on 10/16/16.
 */
public class MyAccountingTest {

    MyAccounting m = new MyAccounting();

    @Before
    public void setup(){

    }

    @Test
    public void calculate1() throws Exception {
        String e = "a = 1; return a;";
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("1"), result);
    }

    @Test
    public void calculate2() throws Exception {
        String e = "a=1; b=2; c=a+b; return c;";
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("3"), result);
    }

    @Test
    public void calculate3() throws Exception {
        String e = "a=1.5; b=2; c=a*b; return c;";
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("3.0"), result);
    }

    @Test
    public void calculate4() throws Exception {
        String e = "a=8; b=2; c=a/b; return c;";
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("4"), result);
    }

    @Test
    public void calculate5() throws Exception {
        String e = "a=8; b=2; c=a/b + b - 3 * 2 + a * 3 + 15; return c;";
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("39"), result);
    }

    @Test
    public void calculate6() throws Exception {
        String e = "a = 5;\n" +
                "b = 6;\n" +
                "if (a == 6)\n" +
                "{ return 10;}" +
                " else { return 20;}";
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("20"), result);
    }

}