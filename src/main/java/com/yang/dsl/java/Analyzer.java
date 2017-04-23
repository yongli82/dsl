package com.yang.dsl.java;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;

/**
 * Created by yangyongli on 08/02/2017.
 */
public class Analyzer {
    public static void main(String[] args) throws Exception{
//        String pathname = "/Users/yangyongli/Projects/dsl/src/main/java/com/yang/dsl/java/Analyzer.java";
        String pathname = "/Users/yangyongli/Projects/ba-finance-budget/ba-finance-budget-biz/src/main/java/com/dianping/ba/finance/budget/biz/impl/BudgetBaseInfoManageServiceObject.java";
        String content = Files.toString(new File(pathname), Charsets.UTF_8);
        CharStream charStream = new ANTLRInputStream(content);
        JavaLexer lexer = new JavaLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        JavaVisitor visitor = new MyJavaVisitor();
        JavaParser.CompilationUnitContext tree = parser.compilationUnit();
        visitor.visit(tree);
    }
}
