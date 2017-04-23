package com.yang.dsl.java.data;

import lombok.Data;

import java.util.List;

/**
 * Created by yangyongli on 08/02/2017.
 */
@Data
public class ClassBean extends BaseBean {
    protected String filePath;
    private String className;
    protected String packageName;

    List<FieldBean> fieldBeanList;
    List<MethodBean> methodBeanList;

}
