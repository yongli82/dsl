package com.meituan.dianping.distribute.calculator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangyongli on 21/09/2017.
 */
public class CalculatorVisitor extends StatementBaseVisitor<Double> {

    Map<String, Double> memory = new HashMap<String, Double>();

    public CalculatorVisitor(Map<String, Double> variables) {
        this.memory.putAll(variables);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitStatement(StatementParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitExpression(StatementParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitSinglePlusOrMinus(StatementParser.SinglePlusOrMinusContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitPlusOrMinus(StatementParser.PlusOrMinusContext ctx) {
        Double leftValue = visit(ctx.left);
        Double rightValue = visit(ctx.right);
        if (ctx.op.getType() == StatementLexer.PLUS) {
            return leftValue + (rightValue);
        } else {
            return leftValue - (rightValue);
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitSingleTimesOrDiv(StatementParser.SingleTimesOrDivContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitTimesOrDiv(StatementParser.TimesOrDivContext ctx) {
        Double leftValue = visit(ctx.left);
        Double rightValue = visit(ctx.right);
        if (ctx.op.getType() == StatementLexer.TIMES) {
            return leftValue * (rightValue);
        } else {
            return leftValue / (rightValue);
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitAtomNumber(StatementParser.AtomNumberContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitAtomToken(StatementParser.AtomTokenContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitParenToken(StatementParser.ParenTokenContext ctx) {
        StatementParser.VariableContext variable = ctx.variable();
        return visitVariable(variable);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitParen(StatementParser.ParenContext ctx) {
        StatementParser.ExpressionContext expression = ctx.expression();
        return visitExpression(expression);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitNumber(StatementParser.NumberContext ctx) {
        String text = ctx.getText();
        text = text.replace(" ", "");
        double value = Double.parseDouble(text);
        return value;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public Double visitVariable(StatementParser.VariableContext ctx) {
        String text = ctx.getText();
        text = text.replace(" ", "");
        if (memory.containsKey(text)) {
            return memory.get(text);
        } else {
            return 0.0;
        }
    }
}
