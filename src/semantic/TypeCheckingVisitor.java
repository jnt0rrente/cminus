package semantic;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;


/*

// definitions
P: FunctionDefinition: type ID statement*
R: for (Statement st : statement*) {
        st.returnType = type.returnType;
    }



//expressions

P: CharLiteral: expression -> CHAR_CONSTANT
R: expression.type = new CharType()

P: IntLiteral: expression -> INT_CONSTANT
R: expression.type = new IntType()

P: RealLiteral: expression -> REAL_CONSTANT
R: expression.type = new RealType()

P: Arithmetic: expression1 -> expression2 (+|-|*|/) expression3
R: expression1.type = expression2.type.arithmetic(expression3.type)

P: Cast: expression1 -> type expression2
R: expression1.type = expression2.type.castTo(type)

P: Comparison: expression1 -> expression2 expression3
R: expression1.type = expression2.type.comparedTo(expression3.type)

P: FieldAccess: expression1 -> expression2 ID
R: expression1.type = expression2.type.dot(ID)

P: FunctionInvocation: expression1 -> expression2 expression*
R: List<Type> argTypes = expression3.stream().map(exp -> exp.type).collect(Collection.toList());
   expression1.type = expression2.type.parentheses(argTypes)

P: Indexing: expression1 -> expression2 expression3
R: expression1.type = expression2.type.squareBrackets(expression3.type)

P: Logical: expression1 -> expression2 expression3
R: expression1.type = expression2.type.logical(expression3.type)

P: UnaryMinus: expression1 -> expression2
R: expression1.type = expression2.type.unaryMinus()

P: UnaryNot: expression1 -> expression2
R: expression1.type = expression2.type.unaryNot()

P: Variable: expression1 -> ID
R: expression1.type = (expression1.definition == null) ? new ErrorType() : expression1.definition.type



// statement

P: Assignment: statement1 -> expression1 expression2
R: expression1.type.isAssigned(expression2.type)

P: IfElse: statement1 -> expression statement2* statement3*
R: expression.type.asBoolean() TODO

P: Read: statement -> expression
R: expression.type.readInto()

P: Return: statement -> expression
R: expression.type.return(returnType)

P: WhileLoop: statement1 -> expression statement2*
R: expression.type.asBoolean() TODO

P: Write: statement -> expression
R: expression.type.written()

 */

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
