package com.yang.dsl.calculator;

import com.yang.dsl.singleline.ExpressionLexer;
import com.yang.dsl.singleline.ExpressionParser;
import com.yang.dsl.singleline.ItemExpressionVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.math.BigDecimal;

/**
 * Created by yangyongli on 10/9/16.
 */
public class Main {

    public static void main(String[] args) {
        String someLangSourceCode = "a=10;\nb=20;\na * b";
        CharStream charStream = new ANTLRInputStream(someLangSourceCode);
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);

        MyCalculatorVisitor visitor = new MyCalculatorVisitor();
        BigDecimal result = visitor.visit(parser.root());
        System.out.println(result);

    }
}

