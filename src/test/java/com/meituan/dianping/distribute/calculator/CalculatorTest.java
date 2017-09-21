package com.meituan.dianping.distribute.calculator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by yangyongli on 21/09/2017.
 */
public class CalculatorTest {
    @Test
    public void calculate() throws Exception {
        Map<String, Double> map = new HashMap<String, Double>();
        map.put("A", 20.0);
        map.put("S", 10.0);
        map.put("B", 30.0);

        double result1 = Calculator.calculate("A + B + S", map);
        System.out.println("A + B + S = " + result1);
    }
}