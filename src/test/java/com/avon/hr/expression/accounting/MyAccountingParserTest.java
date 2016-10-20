package com.avon.hr.expression.accounting;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


/**
 * Created by yangyongli on 20/10/2016.
 */
public class MyAccountingParserTest {

    @Test
    public void check1() throws Exception {
        String expression = "jdfds df - sf - s w3 - sdfas - sdf ";
        System.out.println(expression);
        AccountingParser parser = getAccountingParser(expression);
        int numberOfSyntaxErrors = parser.getNumberOfSyntaxErrors();
        parser.addErrorListener(new ANTLRErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println(recognizer);
            }

            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
                System.out.println(recognizer);
            }

            public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
                System.out.println(recognizer);
            }

            public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
                System.out.println(recognizer);
            }
        });
        System.out.println(numberOfSyntaxErrors);
    }


    public AccountingParser getAccountingParser(String expression) {
        CharStream charStream = new ANTLRInputStream(expression);
        AccountingLexer lexer = new AccountingLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        return new AccountingParser(tokens);
    }
}
