package com.avon.hr.expression.accounting.function;

import com.avon.hr.expression.accounting.CustomiseFunction;

import java.math.BigDecimal;

/**
 * Created by yangyongli on 10/20/16.
 */
public class SummaryAndDouble implements CustomiseFunction {
    public BigDecimal execute(Object... parameters) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Object parameter : parameters) {
            BigDecimal value = null;
            if (parameter instanceof BigDecimal){
                value = (BigDecimal) parameter;
            }else{
                value = new BigDecimal(parameter.toString());
            }
            sum = sum.add(value);
        }

        return sum.multiply(new BigDecimal("2"));
    }
}
