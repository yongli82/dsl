package com.avon.hr.expression.accounting;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by yangyongli on 10/16/16.
 */
public class MyAccountingVisitor implements AccountingVisitor<Object> {

    /**
     * Visit a parse tree produced by {@link AccountingParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitStart(AccountingParser.StartContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#methodBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitMethodBody(AccountingParser.MethodBodyContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBlock(AccountingParser.BlockContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#blockStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitBlockStatement(AccountingParser.BlockStatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitStatement(AccountingParser.StatementContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#forControl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitForControl(AccountingParser.ForControlContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#forInit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitForInit(AccountingParser.ForInitContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#forUpdate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitForUpdate(AccountingParser.ForUpdateContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#expressionList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitExpressionList(AccountingParser.ExpressionListContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#parExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitParExpression(AccountingParser.ParExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code assignVariable}
     * labeled alternative in {@link AccountingParser#assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAssignVariable(AccountingParser.AssignVariableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code singlePlusOrMinus}
     * labeled alternative in {@link AccountingParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitSinglePlusOrMinus(AccountingParser.SinglePlusOrMinusContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code plusOrMinus}
     * labeled alternative in {@link AccountingParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitPlusOrMinus(AccountingParser.PlusOrMinusContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code singleTimesOrDiv}
     * labeled alternative in {@link AccountingParser#multiplyingExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitSingleTimesOrDiv(AccountingParser.SingleTimesOrDivContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code timesOrDiv}
     * labeled alternative in {@link AccountingParser#multiplyingExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitTimesOrDiv(AccountingParser.TimesOrDivContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code atomNumber}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAtomNumber(AccountingParser.AtomNumberContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code atomVariable}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAtomVariable(AccountingParser.AtomVariableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code paren}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitParen(AccountingParser.ParenContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code atomFunction}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitAtomFunction(AccountingParser.AtomFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by the {@code outerFunctionExpression}
     * labeled alternative in {@link AccountingParser#atomExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitOuterFunctionExpression(AccountingParser.OuterFunctionExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#funcExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitFuncExpression(AccountingParser.FuncExpressionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#funcname}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitFuncname(AccountingParser.FuncnameContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#outerFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitOuterFunction(AccountingParser.OuterFunctionContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitNumber(AccountingParser.NumberContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree produced by {@link AccountingParser#variable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public Object visitVariable(AccountingParser.VariableContext ctx) {
        return null;
    }

    /**
     * Visit a parse tree, and return a user-defined result of the operation.
     *
     * @param tree The {@link ParseTree} to visit.
     * @return The result of visiting the parse tree.
     */
    public Object visit(ParseTree tree) {
        return null;
    }

    /**
     * Visit the children of a node, and return a user-defined result of the
     * operation.
     *
     * @param node The {@link RuleNode} whose children should be visited.
     * @return The result of visiting the children of the node.
     */
    public Object visitChildren(RuleNode node) {
        return null;
    }

    /**
     * Visit a terminal node, and return a user-defined result of the operation.
     *
     * @param node The {@link TerminalNode} to visit.
     * @return The result of visiting the node.
     */
    public Object visitTerminal(TerminalNode node) {
        return null;
    }

    /**
     * Visit an error node, and return a user-defined result of the operation.
     *
     * @param node The {@link ErrorNode} to visit.
     * @return The result of visiting the node.
     */
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
