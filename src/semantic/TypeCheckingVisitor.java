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
            new ErrorType(assignment.getLHS().getLine(),assignment.getLHS().getColumn(),"L-value required on assignment.");
        }
        return null;
    }

    @Override
    public Void visit(Read read, Void param) {
        read.getReadVal().accept(this,param);
        if (!read.getReadVal().getLvalue()) {
            new ErrorType(read.getReadVal().getLine(), read.getReadVal().getColumn(), "L-value required on read.");
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

}
