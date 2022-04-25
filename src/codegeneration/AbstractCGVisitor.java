package codegeneration;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import semantic.Visitor;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Program program, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        new ErrorType(assignment.getLine(), assignment.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        new ErrorType(variable.getLine(), variable.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        new ErrorType(arithmetic.getLine(), arithmetic.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(CharLiteral charLiteral, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Indexing indexing, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(IntLiteral intLiteral, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(RealLiteral realLiteral, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Return ret, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(WhileLoop whileLoop, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(Write write, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(StructType structType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        new ErrorType(program.getLine(), program.getColumn(), "placeholder");
        return null;
    }
}
