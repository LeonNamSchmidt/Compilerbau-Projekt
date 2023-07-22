package org.example;

import org.antlr.v4.runtime.tree.*;

/**
 * used to traverse and interpret the generated AST
 */
public class MyListener extends ProjectBaseListener {
    private boolean entered_expr = false;
    private boolean expect_bool = false;
    private boolean ignoreFirstIdentifier = false;
    private String cur_id;
    private final SymbolTable declarations = new SymbolTable();
    private final ExprEval calculator = new ExprEval();


    @Override public void enterProgram(ProjectParser.ProgramContext ctx) {
        declarations.newScope();
    }


    @Override public void exitProgram(ProjectParser.ProgramContext ctx) {
        declarations.exitScope();
    }


    @Override public void enterVarDecl(ProjectParser.VarDeclContext ctx) {
        cur_id= ctx.IDENTIFIER().getText();
        if (declarations.existKey(cur_id)) {
            throw new RuntimeException("Variable " + cur_id + " already declared ");
        }
        if (ctx.getChildCount() != 5) {
            declarations.addDeclaration(ctx.IDENTIFIER().getText(), null);
        }
    }

    @Override public void exitVarDecl(ProjectParser.VarDeclContext ctx) {
        cur_id = null;
    }


    @Override public void enterIfStmt(ProjectParser.IfStmtContext ctx) {
        expect_bool = true;
    } //boolean

    @Override public void exitIfStmt(ProjectParser.IfStmtContext ctx) {
        expect_bool = false;
    }


    @Override public void enterWhileStmt(ProjectParser.WhileStmtContext ctx) {
        expect_bool = true;
    } //boolean

    @Override public void exitWhileStmt(ProjectParser.WhileStmtContext ctx) {
        expect_bool = false;
    }

    @Override public void enterBlock(ProjectParser.BlockContext ctx) {
        declarations.newScope();
    }

    @Override public void exitBlock(ProjectParser.BlockContext ctx) {
        declarations.exitScope();
    }

    @Override public void enterExpression(ProjectParser.ExpressionContext ctx) {
        entered_expr = true;

    }

    @Override public void exitExpression(ProjectParser.ExpressionContext ctx) {
        Object value = calculator.solveExpr();
        if (expect_bool & value instanceof Boolean) {
            expect_bool = false;
        } else if (expect_bool & !(value instanceof Boolean)) {
            throw new IllegalArgumentException("Expected a boolean expression, but received something else.");
        }

        if (cur_id != null) {
            declarations.addDeclaration(cur_id, value);
        }
        cur_id = null;
        entered_expr = false;
    }

    @Override public void enterAssignment(ProjectParser.AssignmentContext ctx) {
        if (ctx.getChildCount() == 3) {
            cur_id = ctx.IDENTIFIER().getText();
            ignoreFirstIdentifier = true;
        } else ignoreFirstIdentifier = false;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        int tokenType = node.getSymbol().getType();
        String tokenText = node.getText();
        if (entered_expr) {
            switch (tokenType) {
                case ProjectLexer.TRUE, ProjectLexer.FALSE -> calculator.add(Boolean.parseBoolean(tokenText));
                case ProjectLexer.NUMBER -> calculator.add(Float.parseFloat(tokenText));
                case ProjectLexer.STRING, ProjectLexer.EQUAL, ProjectLexer.NOTEQUAL, ProjectLexer.GREATEREQUAL, ProjectLexer.LESSEQUAL, ProjectLexer.OR, ProjectLexer.AND ->
                        calculator.add(tokenText);
                case ProjectLexer.IDENTIFIER -> {
                    if (ignoreFirstIdentifier) {
                        ignoreFirstIdentifier = false;
                    } else {
                        calculator.add(declarations.getValue(tokenText));
                    }
                }
                case ProjectLexer.PLUS, ProjectLexer.MINUS, ProjectLexer.BACKSLASH, ProjectLexer.STAR, ProjectLexer.LPARA, ProjectLexer.RPARA, ProjectLexer.EXCLAMATION, ProjectLexer.GREATER, ProjectLexer.LESS ->
                        calculator.add((tokenText.charAt(0)));
                default -> {
                }
            }

        }

    }
}