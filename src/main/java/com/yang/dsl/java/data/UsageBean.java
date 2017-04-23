package com.yang.dsl.java.data;

import lombok.Data;

/**
 * Created by yangyongli on 08/02/2017.
 */
@Data
public class UsageBean extends BaseBean {
    private ClassBean caller;
    private String usage;
}
