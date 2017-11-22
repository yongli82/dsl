package com.avon.hr.accounting;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyongli on 04/12/2016.
 */
public class CheckResult implements Serializable {
    private boolean pass;
    private List<String> needVariables = Lists.newArrayList();
    private List<String> needFunctions = Lists.newArrayList();
    private List<String> errorMessages = Lists.newArrayList();

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public List<String> getNeedVariables() {
        return needVariables;
    }

    public void setNeedVariables(List<String> needVariables) {
        this.needVariables = needVariables;
    }

    public List<String> getNeedFunctions() {
        return needFunctions;
    }

    public void setNeedFunctions(List<String> needFunctions) {
        this.needFunctions = needFunctions;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("pass", pass)
            .append("needVariables", needVariables)
            .append("needFunctions", needFunctions)
            .append("errorMessages", errorMessages)
            .toString();
    }
}
