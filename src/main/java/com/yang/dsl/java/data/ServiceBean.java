package com.yang.dsl.java.data;

import lombok.Data;

/**
 * Created by yangyongli on 08/02/2017.
 */
@Data
public class ServiceBean extends ClassBean {
    private InterfaceBean interfaceBean;
    private String serviceName;
}
