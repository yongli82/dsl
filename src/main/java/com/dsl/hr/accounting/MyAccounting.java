package com.dsl.hr.accounting;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by yangyongli on 10/16/16.
 */
public class MyAccounting {
    private static final Logger logger = LoggerFactory.getLogger(MyAccounting.class);

    /**
     * 表达式计算器
     *
     * @param expression
     * @return
     */
    public BigDecimal calculate(String expression, Map<String, BigDecimal> variables) {
        try {
            AccountingParser parser = getAccountingParser(expression);

            MyAccountingVisitor visitor = new MyAccountingVisitor(variables);
            Object result = visitor.visit(parser.start());
            if (result instanceof BigDecimal) {
                return (BigDecimal) result;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Failed to calculate expression below", e);
            logger.info("expression=\n" + expression);
            return null;
        }
    }

    /**
     * 表达式计算器
     *
     * @param expression
     * @return
     */
    public BigDecimal calculate(String expression, Map<String, BigDecimal> variables, Map<String, CustomiseFunction> functionMap) {
        try {
            AccountingParser parser = getAccountingParser(expression);

            MyAccountingVisitor visitor = new MyAccountingVisitor(variables, functionMap);
            Object result = visitor.visit(parser.start());
            if (result instanceof BigDecimal) {
                return (BigDecimal) result;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Failed to calculate expression below", e);
            logger.info("expression=\n" + expression);
            return null;
        }
    }

    public AccountingParser getAccountingParser(String expression) {
        CharStream charStream = CharStreams.fromString(expression);
        AccountingLexer lexer = new AccountingLexer(charStream);
        lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
        TokenStream tokens = new CommonTokenStream(lexer);
        AccountingParser parser = new AccountingParser(tokens);
        parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
        return parser;
    }

    /**
     * 表达式校验
     *
     * @param expression
     * @return
     */
    public CheckResult check(String expression) {
        return check(expression, null, null);
    }

    /**
     * 表达式校验
     *
     * @param expression
     * @return
     */
    public CheckResult check(String expression, Map<String, BigDecimal> variables) {
        return check(expression, variables, null);
    }

    /**
     * 表达式校验
     *
     * @param expression
     * @return
     */
    public CheckResult check(String expression, Map<String, BigDecimal> variables, Map<String, CustomiseFunction> functionMap) {
        CheckResult checkResult = new CheckResult();
        checkResult.setPass(true);
        try {
            AccountingParser parser = getAccountingParser(expression);

            MyCheckVisitor visitor = new MyCheckVisitor(variables, functionMap);
            visitor.visit(parser.start());
            List<String> needVariables = visitor.getNeedVariables();
            if (CollectionUtils.isNotEmpty(needVariables)) {
                checkResult.setPass(false);
                checkResult.setNeedVariables(needVariables);
            }

            List<String> needFunctions = visitor.getNeedFunctions();
            if (CollectionUtils.isNotEmpty(needFunctions)) {
                checkResult.setPass(false);
                checkResult.setNeedFunctions(needFunctions);
            }
        } catch (Exception e) {
            logger.error("Exception", e);
            checkResult.setPass(false);
            checkResult.getErrorMessages().add(e.getMessage());
        }

        return checkResult;
    }
}
