package com.dsl.hr.accounting;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * Created by yangyongli on 10/16/16.
 */
public class Main {

    public static void main(String[] args) {
        String someLangSourceCode = "a=10;\nb=20;\na * b";
        CharStream charStream = CharStreams.fromString(someLangSourceCode);
        AccountingLexer lexer = new AccountingLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        AccountingParser parser = new AccountingParser(tokens);

        MyAccountingVisitor visitor = new MyAccountingVisitor(null);
        Object result = visitor.visit(parser.start());
        System.out.println(result);
    }
}
