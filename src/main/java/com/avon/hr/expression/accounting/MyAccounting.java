package com.avon.hr.expression.accounting;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.ObjectEqualityComparator;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by yangyongli on 10/16/16.
 */
public class MyAccounting {

    /**
     * 表达式计算器
     * @param expression
     * @return
     */
    public BigDecimal calculate(String expression, Map<String, BigDecimal> variables){
        AccountingParser parser = getAccountingParser(expression);

        MyAccountingVisitor visitor = new MyAccountingVisitor(variables);
        Object result = visitor.visit(parser.start());
        if(result instanceof BigDecimal) {
            return (BigDecimal) result;
        }else{
            return null;
        }
    }

    /**
     * 表达式计算器
     * @param expression
     * @return
     */
    public BigDecimal calculate(String expression, Map<String, BigDecimal> variables, Map<String, CustomiseFunction> functionMap){
        AccountingParser parser = getAccountingParser(expression);

        MyAccountingVisitor visitor = new MyAccountingVisitor(variables, functionMap);
        Object result = visitor.visit(parser.start());
        if(result instanceof BigDecimal) {
            return (BigDecimal) result;
        }else{
            return null;
        }
    }

    public AccountingParser getAccountingParser(String expression) {
        CharStream charStream = new ANTLRInputStream(expression);
        AccountingLexer lexer = new AccountingLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        return new AccountingParser(tokens);
    }
}
