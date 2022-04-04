package semantic;

import ast.Definition;
import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public abstract class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(Assignment assignment, TP param) {
        assignment.getLHS().accept(this, param);
        assignment.getRHS().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        read.getReadVal().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        arithmetic.getOperand1().accept(this, param);
        arithmetic.getOperand2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        cast.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharLiteral charLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        comparison.getOperand1().accept(this, param);
        comparison.getOperand2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.getParameters().forEach(def -> def.accept(this, param));
        functionInvocation.getVariable().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Indexing indexing, TP param) {
        indexing.getArray().accept(this, param);
        return null;
    }

    @Override
    public TR visit(IntLiteral intLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        logical.getOperand1().accept(this,param);
        logical.getOperand2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(RealLiteral realLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        unaryMinus.getTarget().accept(this,param);
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        unaryNot.getTarget().accept(this,param);
        return null;
    }

    @Override
    public TR visit(Program program, TP param) {
        for (Definition def : program.getDefinitions()) {
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        functionDefinition.getBodyStatements().forEach(def -> def.accept(this,param));
        functionDefinition.getBodyVariableDefinitions().forEach(def -> def.accept(this, param));
        functionDefinition.getType().accept(this,param);
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        return null;
    }


    @Override
    public TR visit(IfElse ifElse, TP param) {
        ifElse.getCondition().accept(this, param);
        ifElse.getBody().forEach(stat -> stat.accept(this, param));
        ifElse.getBodyElse().forEach(stat -> stat.accept(this, param));
        return null;
    }


    @Override
    public TR visit(Return ret, TP param) {
        ret.getReturnValue().accept(this, param);
        return null;
    }

    @Override
    public TR visit(WhileLoop whileLoop, TP param) {
        whileLoop.getCondition().accept(this, param);
        whileLoop.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Write write, TP param) {
        write.getWriteVal().accept(this,param);
        return null;
    }



    @Override
    public TR visit(CharType charType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        return null;
    }

    @Override
    public TR visit(StructType structType, TP param) {
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        return null;
    }
}
