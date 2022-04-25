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
        new ErrorType(program.getLine(), program.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP param) {
        new ErrorType(assignment.getLine(), assignment.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        new ErrorType(variable.getLine(), variable.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        new ErrorType(arithmetic.getLine(), arithmetic.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        new ErrorType(cast.getLine(), cast.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(CharLiteral charLiteral, TP param) {
        new ErrorType(charLiteral.getLine(), charLiteral.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        new ErrorType(comparison.getLine(), comparison.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        new ErrorType(fieldAccess.getLine(), fieldAccess.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Indexing indexing, TP param) {
        new ErrorType(indexing.getLine(), indexing.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(IntLiteral intLiteral, TP param) {
        new ErrorType(intLiteral.getLine(), intLiteral.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        new ErrorType(logical.getLine(), logical.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(RealLiteral realLiteral, TP param) {
        new ErrorType(realLiteral.getLine(), realLiteral.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        new ErrorType(unaryMinus.getLine(), unaryMinus.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        new ErrorType(unaryNot.getLine(), unaryNot.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        new ErrorType(functionDefinition.getLine(), functionDefinition.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        new ErrorType(variableDefinition.getLine(), variableDefinition.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP param) {
        new ErrorType(ifElse.getLine(), ifElse.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        new ErrorType(read.getLine(), read.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Return ret, TP param) {
        new ErrorType(ret.getLine(), ret.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(WhileLoop whileLoop, TP param) {
        new ErrorType(whileLoop.getLine(), whileLoop.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(Write write, TP param) {
        new ErrorType(write.getLine(), write.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        new ErrorType(charType.getLine(), charType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        new ErrorType(doubleType.getLine(), doubleType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        new ErrorType(errorType.getLine(), errorType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        new ErrorType(functionType.getLine(), functionType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        new ErrorType(intType.getLine(), intType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        new ErrorType(recordField.getLine(), recordField.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(StructType structType, TP param) {
        new ErrorType(structType.getLine(), structType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        new ErrorType(voidType.getLine(), voidType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        new ErrorType(arrayType.getLine(), arrayType.getColumn(), "This visitor cannot visit this node.");
        return null;
    }
}
