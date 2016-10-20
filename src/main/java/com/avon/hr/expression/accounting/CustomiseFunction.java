package com.avon.hr.expression.accounting;

import java.math.BigDecimal;

/**
 * Created by yangyongli on 10/20/16.
 */
public interface CustomiseFunction {

    BigDecimal execute(Object... parameters);
}
