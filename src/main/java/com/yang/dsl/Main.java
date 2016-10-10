package com.yang.dsl;

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
        String someLangSourceCode = "SUM(1,2,3,4,5,6,7,8,9,10)";
        CharStream charStream = new ANTLRInputStream(someLangSourceCode);
        ExpressionLexer lexer = new ExpressionLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);

        ItemExpressionVisitor visitor = new ItemExpressionVisitor();
        BigDecimal result = visitor.visit(parser.root());
        System.out.println(result);

    }
}

