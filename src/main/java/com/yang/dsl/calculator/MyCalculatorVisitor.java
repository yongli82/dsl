package com.yang.dsl.calculator;

import com.yang.dsl.singleline.ExpressionLexer;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangyongli on 10/10/16.
 */
public class MyCalculatorVisitor extends AbstractParseTreeVisitor<BigDecimal> implements CalculatorVisitor<BigDecimal> {
    Map<String, BigDecimal> memory = new HashMap<String, BigDecimal>();

    /**
     * Visit a parse tree produced by {@link CalculatorParser#root}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitRoot(CalculatorParser.RootContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code assignVariable}
     * labeled alternative in {@link CalculatorParser#assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAssignVariable(CalculatorParser.AssignVariableContext ctx) {
        CalculatorParser.VariableContext variable = ctx.variable();
        String variableText = variable.getText();
        CalculatorParser.ExpressionContext expression = ctx.expression();
        BigDecimal value = visit(expression);
        memory.put(variableText, value);
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code singlePlusOrMinus}
     * labeled alternative in {@link CalculatorParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitSinglePlusOrMinus(CalculatorParser.SinglePlusOrMinusContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code plusOrMinus}
     * labeled alternative in {@link CalculatorParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitPlusOrMinus(CalculatorParser.PlusOrMinusContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        if (ctx.op.getType() == CalculatorLexer.PLUS) {
            return leftValue.add(rightValue);
        } else {
            return leftValue.subtract(rightValue);
        }
    }

    /**
     * Visit a parse tree produced by the {@code singleTimesOrDiv}
     * labeled alternative in {@link CalculatorParser#multiplyingExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitSingleTimesOrDiv(CalculatorParser.SingleTimesOrDivContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code timesOrDiv}
     * labeled alternative in {@link CalculatorParser#multiplyingExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitTimesOrDiv(CalculatorParser.TimesOrDivContext ctx) {
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        if(ctx.op.getType() == CalculatorLexer.TIMES){
            return leftValue.multiply(rightValue);
        }else{
            return leftValue.divide(rightValue);
        }
    }

    /**
     * Visit a parse tree produced by the {@code atomNumber}
     * labeled alternative in {@link CalculatorParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAtomNumber(CalculatorParser.AtomNumberContext ctx) {
        String text = ctx.getText();
        return new BigDecimal(text);
    }

    /**
     * Visit a parse tree produced by the {@code atomVariable}
     * labeled alternative in {@link CalculatorParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAtomVariable(CalculatorParser.AtomVariableContext ctx) {
        CalculatorParser.VariableContext variable = ctx.variable();
        return visit(variable);
    }

    /**
     * Visit a parse tree produced by the {@code paren}
     * labeled alternative in {@link CalculatorParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitParen(CalculatorParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    /**
     * Visit a parse tree produced by the {@code atomFunction}
     * labeled alternative in {@link CalculatorParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAtomFunction(CalculatorParser.AtomFunctionContext ctx) {
        CalculatorParser.FuncExpressionContext funcExpressionContext = ctx.funcExpression();
        return visit(funcExpressionContext);
    }

    /**
     * Visit a parse tree produced by {@link CalculatorParser#funcExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitFuncExpression(CalculatorParser.FuncExpressionContext ctx) {
        CalculatorParser.FuncnameContext funcname = ctx.funcname();
        String funcnameText = funcname.getText();
        if (funcnameText.equals("SUM")) {
            BigDecimal sum = BigDecimal.ZERO;
            List<CalculatorParser.ExpressionContext> expressionList = ctx.expression();
            for (CalculatorParser.ExpressionContext expressionContext : expressionList) {
                BigDecimal decimal = visit(expressionContext);
                sum = sum.add(decimal);
            }
            return sum;
        }
        return BigDecimal.ZERO;
    }

    /**
     * Visit a parse tree produced by {@link CalculatorParser#funcname}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitFuncname(CalculatorParser.FuncnameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link CalculatorParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitNumber(CalculatorParser.NumberContext ctx) {
        String text = ctx.getText();
        return new BigDecimal(text);
    }

    /**
     * Visit a parse tree produced by {@link CalculatorParser#variable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitVariable(CalculatorParser.VariableContext ctx) {
        if (memory.containsKey(ctx.getText())) {
            return memory.get(ctx.getText());
        }
        //TODO throw exception
        return BigDecimal.ZERO;
    }
}
