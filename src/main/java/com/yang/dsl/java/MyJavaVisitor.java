package com.yang.dsl.java;

import com.google.common.collect.Lists;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by yangyongli on 08/02/2017.
 */
public class MyJavaVisitor extends JavaBaseVisitor<Object> {
    private static Logger logger = LoggerFactory.getLogger(MyJavaVisitor.class);

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        String packageName = ctx.qualifiedName().getText();
        logger.info("visitPackageDeclaration: {}",  packageName);
        logger.info(packageName);
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    public Object visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        JavaParser.ClassDeclarationContext classDeclarationContext = ctx.classDeclaration();
        JavaParser.InterfaceDeclarationContext interfaceDeclarationContext = ctx.interfaceDeclaration();
        if(null != classDeclarationContext){
            TerminalNode identifier = classDeclarationContext.Identifier();
            String className = identifier.getText();
            logger.info("visitTypeDeclaration: classDeclaration : className: {}",  className);

            JavaParser.TypeListContext implementInterfaceContext = classDeclarationContext.typeList();
            if(null != implementInterfaceContext) {
                List<String> interfaceList = Lists.newArrayList();
                List<JavaParser.TypeTypeContext> interfaceTypes = implementInterfaceContext.typeType();
                for (JavaParser.TypeTypeContext interfaceType : interfaceTypes) {
                    String type = interfaceType.getText();
                    interfaceList.add(type);
                }
                logger.info("        interfaces: {}",  className, StringUtils.join(interfaceList));
            }
            JavaParser.TypeTypeContext superClassContext = classDeclarationContext.typeType();
            if(null != superClassContext){
                String superClass = superClassContext.getText();
                logger.info("        superClass: {}",  className, superClass);
            }

        }else if(null != interfaceDeclarationContext){
            TerminalNode identifier = interfaceDeclarationContext.Identifier();
            String interfaceName = identifier.getText();
            logger.info("visitTypeDeclaration: interfaceDeclaration : interfaceName: {}",  interfaceName);
        }
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        String methodDeclaration = ctx.getText();
        String methodName = ctx.Identifier().getText();
        logger.info("visitMethodDeclaration: {}",  methodName);
        JavaParser.TypeTypeContext typeTypeContext = ctx.typeType();
        String returnType = "void";
        if(null != typeTypeContext){
            returnType = typeTypeContext.getText();
        }

        logger.info("         return type: {}", returnType);

        List<JavaParser.FormalParameterContext> parameterContextList = ctx.formalParameters().formalParameterList().formalParameter();

        for (JavaParser.FormalParameterContext formalParameterContext : parameterContextList) {
            String parameterType = formalParameterContext.typeType().getText();
            String parameterVar = formalParameterContext.variableDeclaratorId().getText();
            logger.info("         parameter: type: {} | var: {}", parameterType, parameterVar);
        }

        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    public Object visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        String fieldDeclaration = ctx.getText();
        logger.info("visitFieldDeclaration: {}",  fieldDeclaration);
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    public Object visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        String methodDeclaration = ctx.getText();
        logger.info("visitInterfaceMethodDeclaration: {}", methodDeclaration);
        return visitChildren(ctx);
    }
}
