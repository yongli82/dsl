package com.avon.hr.expression.accounting;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by yangyongli on 10/16/16.
 */
public class MyAccountingVisitor extends AbstractParseTreeVisitor<BigDecimal> implements AccountingVisitor<BigDecimal> {
    Logger logger = Logger.getLogger(MyAccountingVisitor.class);
    private Map<String, BigDecimal> variables = null;
    private boolean isTerminal = false;

    public MyAccountingVisitor(Map<String, BigDecimal> variables) {
        if (null != variables) {
            this.variables = new HashMap<String, BigDecimal>(variables);
        } else {
            this.variables = new HashMap<String, BigDecimal>();
        }
    }


    /**
     * Visit a parse tree produced by {@link AccountingParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitStart(AccountingParser.StartContext ctx) {
        logger.debug("visitStart");
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#methodBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitMethodBody(AccountingParser.MethodBodyContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitBlock(AccountingParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#blockStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitBlockStatement(AccountingParser.BlockStatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code ifelseStatement}
     * labeled alternative in {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitIfelseStatement(AccountingParser.IfelseStatementContext ctx) {
        logger.debug("visitIfelseStatement");
        AccountingParser.JudgeExpressionContext judgeExpressionContext = ctx.judgeExpression();
        BigDecimal judge = visit(judgeExpressionContext);
        logger.debug("judge(" + judgeExpressionContext.getText() + "):" + judge.equals(BigDecimal.ONE));
        if (judge.equals(BigDecimal.ONE)) {
            logger.debug("yesblock");
            return visit(ctx.yesblock);
        } else {
            logger.debug("noblock");
            return visit(ctx.noblock);
        }
    }

    /**
     * Visit a parse tree produced by the {@code forStatement}
     * labeled alternative in {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitForStatement(AccountingParser.ForStatementContext ctx) {
        return null;
    }

    /**
     * 返回值
     * Visit a parse tree produced by the {@code returnStatement}
     * labeled alternative in {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitReturnStatement(AccountingParser.ReturnStatementContext ctx) {
        logger.debug("visitReturnStatement");
        AccountingParser.ExpressionContext expression = ctx.expression();
        //return 退出解释器怎么实现？
        //结束树遍历，把值返回
        BigDecimal value = visit(expression);
        logger.debug("return value=" + value);
        this.isTerminal = true;
        return value;
    }

    /**
     * 处理return，if等跳出树遍历的分支
     *
     * @param node
     * @param currentResult
     * @return
     */
    protected boolean shouldVisitNextChild(RuleNode node, BigDecimal currentResult) {
        if (isTerminal) {
            logger.debug("isTerminal");
            return true;
        }
        return true;
    }

    /**
     * Visit a parse tree produced by the {@code breakStatement}
     * labeled alternative in {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitBreakStatement(AccountingParser.BreakStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code continueStatement}
     * labeled alternative in {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitContinueStatement(AccountingParser.ContinueStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitStatement(AccountingParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#forControl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitForControl(AccountingParser.ForControlContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#forInit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitForInit(AccountingParser.ForInitContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#forUpdate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitForUpdate(AccountingParser.ForUpdateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#expressionList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitExpressionList(AccountingParser.ExpressionListContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#parExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitParExpression(AccountingParser.ParExpressionContext ctx) {
        return null;
    }

    /**
     * 判断语句
     * BigDecimal.ONE == true
     * BigDecimal.ZREO == false
     * Visit a parse tree produced by {@link AccountingParser#judgeExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitJudgeExpression(AccountingParser.JudgeExpressionContext ctx) {
        BigDecimal left = visit(ctx.left);
        BigDecimal right = visit(ctx.right);
        String op = ctx.op.getText();
        boolean result = false;
        int compareTo = left.compareTo(right);
        if (op.equals("==")) {
            result = compareTo == 0;
        } else if (op.equals(">")) {
            result = compareTo > 0;
        } else if (op.equals(">=")) {
            result = compareTo >= 0;
        } else if (op.equals("<")) {
            result = compareTo < 0;
        } else if (op.equals("<=")) {
            result = compareTo <= 0;
        } else if (op.equals("!=")) {
            result = compareTo != 0;
        } else if (op.equals("<>")) {
            result = compareTo != 0;
        } else {
            throw new RuntimeException("Unsupported compare operator [" + op + "].");
        }
        ctx.result = result;
        logger.debug("ctx.result=" + ctx.result);
        if (result) {
            return BigDecimal.ONE;
        } else {
            return BigDecimal.ZERO;
        }
    }

    /**
     * Visit a parse tree produced by the {@code assignVariable}
     * labeled alternative in {@link AccountingParser#assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
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
     * Visit a parse tree produced by the {@code singlePlusOrMinus}
     * labeled alternative in {@link AccountingParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitSinglePlusOrMinus(AccountingParser.SinglePlusOrMinusContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code plusOrMinus}
     * labeled alternative in {@link AccountingParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitPlusOrMinus(AccountingParser.PlusOrMinusContext ctx) {
        logger.debug("visitPlusOrMinus:" + ctx.getText());
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        BigDecimal result = null;
        if (ctx.op.getType() == AccountingParser.PLUS) {
            result = leftValue.add(rightValue);
        } else {
            result = leftValue.subtract(rightValue);
        }

        logger.debug(ctx.getText() + " : " + result);
        return result;
    }

    /**
     * Visit a parse tree produced by the {@code singleTimesOrDiv}
     * labeled alternative in {@link AccountingParser#multiplyingExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitSingleTimesOrDiv(AccountingParser.SingleTimesOrDivContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code timesOrDiv}
     * labeled alternative in {@link AccountingParser#multiplyingExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitTimesOrDiv(AccountingParser.TimesOrDivContext ctx) {
        logger.debug("visitTimesOrDiv:" + ctx.getText());
        BigDecimal leftValue = visit(ctx.left);
        BigDecimal rightValue = visit(ctx.right);
        BigDecimal result = null;
        if (ctx.op.getType() == AccountingParser.TIMES) {
            result = leftValue.multiply(rightValue);
        } else {
            result = leftValue.divide(rightValue);
        }

        logger.debug(ctx.getText() + " : " + result);
        return result;
    }

    /**
     * Visit a parse tree produced by the {@code atomNumber}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAtomNumber(AccountingParser.AtomNumberContext ctx) {
        String text = ctx.getText();
        return new BigDecimal(text);
    }

    /**
     * Visit a parse tree produced by the {@code atomVariable}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAtomVariable(AccountingParser.AtomVariableContext ctx) {
        AccountingParser.IdentifierContext identifier = ctx.identifier();
        return visit(identifier);
    }

    /**
     * Visit a parse tree produced by the {@code paren}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitParen(AccountingParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    /**
     * Visit a parse tree produced by the {@code atomFunction}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitAtomFunction(AccountingParser.AtomFunctionContext ctx) {
        AccountingParser.FuncExpressionContext funcExpressionContext = ctx.funcExpression();
        return visit(funcExpressionContext);
    }

    /**
     * Visit a parse tree produced by the {@code outerFunctionExpression}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitOuterFunctionExpression(AccountingParser.OuterFunctionExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#funcExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitFuncExpression(AccountingParser.FuncExpressionContext ctx) {
        AccountingParser.FuncnameContext funcname = ctx.funcname();
        String funcnameText = funcname.getText();
        if (funcnameText.equals("SUM")) {
            BigDecimal sum = BigDecimal.ZERO;
            List<AccountingParser.ExpressionContext> expressionList = ctx.expression();
            for (AccountingParser.ExpressionContext expressionContext : expressionList) {
                BigDecimal decimal = visit(expressionContext);
                sum = sum.add(decimal);
            }
            return sum;
        }
        return BigDecimal.ZERO;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#funcname}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitFuncname(AccountingParser.FuncnameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#outerFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitOuterFunction(AccountingParser.OuterFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public BigDecimal visitNumber(AccountingParser.NumberContext ctx) {
        String text = ctx.getText();
        return new BigDecimal(text);
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
            throw new RuntimeException("Variable [" + variableName + "] does not exist.");
        }
    }


}
