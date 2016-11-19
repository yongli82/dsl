package com.avon.hr.expression.accounting;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

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


    @Test
    public void calculate7() throws Exception {
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        map.put("工资", new BigDecimal("10000"));
        map.put("补贴", new BigDecimal("200"));
        map.put("税率", new BigDecimal("0.01"));
        map.put("养老金上限", new BigDecimal("8000"));
        map.put("养老金下限", new BigDecimal("2000"));
        map.put("养老金比率", new BigDecimal("0.08"));
        String e = "税 = 工资 * 税率 \n" +
                "养老金基数 = 工资\n" +
                "if(工资 > 养老金上限) { 养老金基数=养老金上限}\n" +
                "if(工资 < 养老金下限) { 养老金基数=养老金下限}\n" +
                "养老金 = 养老金基数 * 养老金比率\n" +
                "应付薪水 = 工资 + 补贴 - 税 - 养老金\n" +
                 "return 应付薪水";
        System.out.println(e);
        BigDecimal result = m.calculate(e, map);
        assertEquals(new BigDecimal("9460.00"), result);
    }

    @Test
    public void calculate8() throws Exception {
        String e = "m = 1;\n" +
                "for(a = 1; a < 100; a = a+1 )\n" +
                "{ m = m + a }\n" +
                "return m;";
        System.out.println(e);
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("4951"), result);
    }

    @Test
    public void calculate9() throws Exception {
        String e = "a = SUM(1,3,5,7,9);\n" +
                "return a;";
        System.out.println(e);
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("25"), result);
    }

    @Test
    public void calculate10() throws Exception {
        String e = "a = AVERAGE(1,3,5,7,9);\n" +
                "return a;";
        System.out.println(e);
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("5.00"), result);
    }

    @Test
    public void calculate11() throws Exception {
        String e = "a = MIN(10,13,5,7,9);\n" +
                "return a;";
        System.out.println(e);
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("5"), result);
    }

    @Test
    public void calculate12() throws Exception {
        String e = "a = MAX(10,13,5,7,9);\n" +
                "return a;";
        System.out.println(e);
        BigDecimal result = m.calculate(e, null);
        assertEquals(new BigDecimal("13"), result);
    }

    @Test
    public void calculate13() throws Exception {
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
        System.out.println(e);

        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        map.put("基本工资", new BigDecimal("10000"));
        map.put("社保缴费", new BigDecimal("1000"));
        BigDecimal result = m.calculate(e, map);
        assertEquals(new BigDecimal("8705.0"), result);

        map.put("基本工资", new BigDecimal("20000"));
        result = m.calculate(e, map);
        assertEquals(new BigDecimal("16505.00"), result);

        map.put("基本工资", new BigDecimal("30000"));
        map.put("社保缴费", new BigDecimal("3000"));
        result = m.calculate(e, map);
        assertEquals(new BigDecimal("22505.00"), result);

        map.put("基本工资", new BigDecimal("300000"));
        map.put("社保缴费", new BigDecimal("30000"));
        result = m.calculate(e, map);
        assertEquals(new BigDecimal("164255.00"), result);
    }
}