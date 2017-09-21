package com.meituan.dianping.distribute.calculator;

import org.antlr.v4.runtime.*;

import java.util.Map;

/**
 * Created by yangyongli on 21/09/2017.
 */
public class Calculator {

    public static double calculate(String statement, Map<String, Double> variables) {
        CharStream charStream = CharStreams.fromString(statement);
        StatementLexer lexer = new StatementLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        StatementParser parser = new StatementParser(tokens);

        CalculatorVisitor visitor = new CalculatorVisitor(variables);
        Double result = visitor.visit(parser.statement());
        return result;
    }
}
