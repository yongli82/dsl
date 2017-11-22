package com.dsl.hr.accounting;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.apache.commons.lang.StringUtils;

/**
 * Created by yangyongli on 20/10/2016.
 */
public class DescriptiveErrorListener extends BaseErrorListener {
    public static final DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        String sourceName = recognizer.getInputStream().getSourceName();
        if (!StringUtils.isEmpty(sourceName)) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        System.err.println(sourceName + "line " + line + ":" + charPositionInLine + " " + msg);
    }
}
