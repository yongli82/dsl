package com.dsl.hr.accounting;

import com.google.common.collect.Lists;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 语法检查器
 * Created by yangyongli on 21/10/2016.
 */
public class MyCheckVisitor extends AccountingBaseVisitor<BigDecimal>{

    Logger logger = Logger.getLogger(MyAccountingVisitor.class);
    private Map<String, BigDecimal> variables = new HashMap<>();
    private boolean isTerminal = false;
    private Map<String, CustomiseFunction> functionMap = new HashMap<>();

    private List<String> needVariables = Lists.newArrayList();

    private List<String> needFunctions = Lists.newArrayList();

    public MyCheckVisitor(Map<String, BigDecimal> variables) {
        if (null != variables) {
            this.variables = new HashMap<>(variables);
        }
    }

    public MyCheckVisitor(Map<String, BigDecimal> variables, Map<String, CustomiseFunction> functionMap) {
        this(variables);
        if(null != functionMap) {
            this.functionMap = functionMap;
        }
    }

    public BigDecimal visitAssignVariable(AccountingParser.AssignVariableContext ctx) {
        logger.debug("visitAssignVariable:" + ctx.getText());
        AccountingParser.IdentifierContext identifier = ctx.identifier();
        String variableText = identifier.getText();
        AccountingParser.ExpressionContext expression = ctx.expression();
        BigDecimal value = visit(expression);
        variables.put(variableText, value);
        return null;
    }


    /**
     * Visit a parse tree produced by {@link AccountingParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitIdentifier(AccountingParser.IdentifierContext ctx) {
        String variableName = ctx.getText();
        if (variables.containsKey(variableName)) {
            return variables.get(variableName);
        } else {
            if(!needVariables.contains(variableName)) {
                needVariables.add(variableName);
            }
            return null;
        }
    }

    public BigDecimal visitOuterFunction(AccountingParser.OuterFunctionContext ctx) {
        logger.debug("visitOuterFunction:" + ctx.getText());
        String functionName = ctx.identifier().getText();
        CustomiseFunction customiseFunction = this.functionMap.get(functionName);
        if(null == customiseFunction){
            if(!needFunctions.contains(functionName)) {
                needFunctions.add(functionName);
            }
        }

        return null;
    }

    public Map<String, BigDecimal> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, BigDecimal> variables) {
        this.variables = variables;
    }

    public boolean isTerminal() {
        return isTerminal;
    }

    public void setTerminal(boolean terminal) {
        isTerminal = terminal;
    }

    public Map<String, CustomiseFunction> getFunctionMap() {
        return functionMap;
    }

    public void setFunctionMap(Map<String, CustomiseFunction> functionMap) {
        this.functionMap = functionMap;
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
}
