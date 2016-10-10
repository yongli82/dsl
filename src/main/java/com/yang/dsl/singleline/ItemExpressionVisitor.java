package com.yang.dsl.singleline;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangyongli on 10/9/16.
 */
public class ItemExpressionVisitor extends ExpressionBaseVisitor<BigDecimal> {
    Map<String, BigDecimal> memory = new HashMap<String, BigDecimal>();

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitRoot(ExpressionParser.RootContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitSinglePlusOrMinus(ExpressionParser.SinglePlusOrMinusContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitPlusOrMinus(ExpressionParser.PlusOrMinusContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        if (ctx.op.getType() == ExpressionLexer.PLUS) {
            return leftValue.add(rightValue);
        } else {
            return leftValue.subtract(rightValue);
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitSingleTimesOrDiv(ExpressionParser.SingleTimesOrDivContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitTimesOrDiv(ExpressionParser.TimesOrDivContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        if(ctx.op.getType() == ExpressionLexer.TIMES){
            return leftValue.multiply(rightValue);
        }else{
            return leftValue.divide(rightValue);
        }
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitAtomExpression(ExpressionParser.AtomExpressionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitFuncExpression(ExpressionParser.FuncExpressionContext ctx) {
        ExpressionParser.FuncnameContext funcname = ctx.funcname();
        String funcnameText = funcname.getText();
        if (funcnameText.equals("SUM")) {
            BigDecimal sum = BigDecimal.ZERO;
            List<ExpressionParser.ExpressionContext> expressionList = ctx.expression();
            for (ExpressionParser.ExpressionContext expressionContext : expressionList) {
                BigDecimal decimal = expressionContext.accept(this);
                sum = sum.add(decimal);
            }
            return sum;
        }
        return BigDecimal.ZERO;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitFuncname(ExpressionParser.FuncnameContext ctx) {
        return BigDecimal.ZERO;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitNumber(ExpressionParser.NumberContext ctx) {
        String text = ctx.getText();
        return new BigDecimal(text);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitVariable(ExpressionParser.VariableContext ctx) {
        if (memory.containsKey(ctx.getText())) {
            return memory.get(ctx.getText());
        }
        return BigDecimal.ZERO;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitAtomNumber(ExpressionParser.AtomNumberContext ctx) {
        String text = ctx.getText();
        return new BigDecimal(text);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitAtomVariable(ExpressionParser.AtomVariableContext ctx) {
        if (memory.containsKey(ctx.getText())) {
            return memory.get(ctx.getText());
        }
        return BigDecimal.ZERO;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitParen(ExpressionParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    public BigDecimal visitAtomFunction(ExpressionParser.AtomFunctionContext ctx) {
        ExpressionParser.FuncExpressionContext funcExpressionContext = ctx.funcExpression();
        return visit(funcExpressionContext);
    }


}
