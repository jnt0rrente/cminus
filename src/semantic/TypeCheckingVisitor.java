package semantic;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(Assignment assignment, Void param) {
        assignment.getLHS().accept(this, param);
        assignment.getRHS().accept(this, param);

        if (!assignment.getLHS().getLvalue()) {
            new ErrorType(assignment.getLHS().getLine(),assignment.getLHS().getColumn(),"L-value required");
        }
        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        variable.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getOperand1().accept(this, param);
        arithmetic.getOperand2().accept(this, param);
        arithmetic.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExp().accept(this, param);
        cast.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.getOperand1().accept(this, param);
        comparison.getOperand2().accept(this, param);
        comparison.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getExp().accept(this, param);
        fieldAccess.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getParameters().forEach(def -> def.accept(this, param));
        functionInvocation.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.getArray().accept(this, param);
        indexing.setLvalue(true);
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.getOperand1().accept(this,param);
        logical.getOperand2().accept(this, param);
        logical.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(RealLiteral realLiteral, Void param) {
        realLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getTarget().accept(this,param);
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getTarget().accept(this,param);
        unaryNot.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        ifElse.getCondition().accept(this, param);
        ifElse.getBody().forEach(stat -> stat.accept(this, param));
        ifElse.getBodyElse().forEach(stat -> stat.accept(this, param));
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        read.getReadVal().accept(this,param);
        return null;
    }

    @Override
    public Void visit(Return ret, Void param) {
        ret.getReturnValue().accept(this, param);
        return null;
    }

    @Override
    public Void visit(WhileLoop whileLoop, Void param) {
        whileLoop.getCondition().accept(this, param);
        whileLoop.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public Void visit(Write write, Void param) {
        write.getWriteVal().accept(this,param);
        return null;
    }

    @Override
    public Void visit(CharType charType, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    @Override
    public Void visit(ErrorType errorType, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        return null;
    }

    @Override
    public Void visit(IntType intType, Void param) {
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        return null;
    }

    @Override
    public Void visit(StructType structType, Void param) {
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        return null;
    }


}
