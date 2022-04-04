package semantic;

import ast.Expression;
import ast.Statement;
import ast.Type;
import ast.definition.FunctionDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

import java.util.List;
import java.util.stream.Collectors;



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
R: expression.type.asBoolean()
    for (Statement st : statement2*) {
        st.returnType = type.returnType;
    }
    for (Statement st : statement3*) {
        st.returnType = type.returnType;
    }

P: Read: statement -> expression
R: expression.type.readInto()

P: Return: statement -> expression
R: expression.type.return(returnType)

P: WhileLoop: statement1 -> expression statement2*
R: expression.type.asBoolean()
    for (Statement st : statement2*) {
        st.returnType = type.returnType;
    }

P: Write: statement -> expression
R: expression.type.written()

 */

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {


    @Override
    public Void visit(FunctionDefinition functionDefinition, Type param) {
        functionDefinition.getType().accept(this, param);
        functionDefinition.getBodyStatements().forEach(statement -> statement.accept(this, ((FunctionType) functionDefinition.getType()).getReturnType()));
        functionDefinition.getBodyVariableDefinitions().forEach(def -> def.accept(this, param));

        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Type param) {
        charLiteral.setLvalue(false);
        charLiteral.setType(new CharType(charLiteral.getLine(), charLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Type param) {
        intLiteral.setLvalue(false);
        intLiteral.setType(new IntType(intLiteral.getLine(), intLiteral.getColumn()));
        return null;
    }

    @Override
    public Void visit(RealLiteral realLiteral, Type param) {
        realLiteral.setLvalue(false);
        realLiteral.setType(new DoubleType(realLiteral.getLine(), realLiteral.getColumn()));
        return null;
    }


    @Override
    public Void visit(Arithmetic arithmetic, Type param) {
        arithmetic.getOperand1().accept(this, param);
        arithmetic.getOperand2().accept(this, param);
        arithmetic.setLvalue(false);

        Type type1 = arithmetic.getOperand1().getType(); //clarity
        Type type2 = arithmetic.getOperand2().getType();
        arithmetic.setType(type1.arithmetic(type2));

        return null;
    }

    @Override
    public Void visit(Cast cast, Type param) {
        cast.getExpression().accept(this, param);
        cast.setLvalue(false);

        Type castedType = cast.getExpression().getType();
        Type targetType = cast.getCastType();
        cast.setType(castedType.castTo(targetType));

        return null;
    }

    @Override
    public Void visit(Comparison comparison, Type param) {
        comparison.getOperand1().accept(this, param);
        comparison.getOperand2().accept(this, param);
        comparison.setLvalue(false);

        Type type1 = comparison.getOperand1().getType();
        Type type2 = comparison.getOperand2().getType();
        comparison.setType(type1.comparedTo(type2));
        return null;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Type param) {
        fieldAccess.getExpression().accept(this, param);
        fieldAccess.setLvalue(true);

        Type type = fieldAccess.getExpression().getType();
        String name = fieldAccess.getName();
        fieldAccess.setType(type.dot(name));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Type param) {
        functionInvocation.getParameters().forEach(def -> def.accept(this, param));
        functionInvocation.getVariable().accept(this, param);
        functionInvocation.setLvalue(false);

        Type returnType = functionInvocation.getVariable().getType();
        List<Type> parameterTypes = functionInvocation.getParameters().stream().map(Expression::getType).collect(Collectors.toList());
        functionInvocation.setType(returnType.parentheses(parameterTypes));
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Type param) {
        indexing.getArray().accept(this, param);
        indexing.getIndex().accept(this, param);
        indexing.setLvalue(true);

        Type type1 = indexing.getArray().getType();
        Type type2 = indexing.getIndex().getType();
        indexing.setType(type1.squareBrackets(type2));
        return null;
    }


    @Override
    public Void visit(Logical logical, Type param) {
        logical.getOperand1().accept(this, param);
        logical.getOperand2().accept(this, param);
        logical.setLvalue(false);

        Type type1 = logical.getOperand1().getType();
        Type type2 = logical.getOperand2().getType();
        logical.setType(type1.logical(type2));
        return null;
    }


    @Override
    public Void visit(UnaryMinus unaryMinus, Type param) {
        unaryMinus.getTarget().accept(this, param);
        unaryMinus.setLvalue(false);

        Type type1 = unaryMinus.getTarget().getType();
        unaryMinus.setType(type1.unaryMinus());
        return null;
    }


    @Override
    public Void visit(UnaryNot unaryNot, Type param) {
        unaryNot.getTarget().accept(this, param);
        unaryNot.setLvalue(false);

        Type type1 = unaryNot.getTarget().getType();
        unaryNot.setType(type1.unaryNot());
        return null;
    }


    //statements
    @Override
    public Void visit(IfElse ifElse, Type param) {
        ifElse.getCondition().accept(this, param);
        ifElse.getBody().forEach(s -> s.accept(this, param));
        ifElse.getBodyElse().forEach(s -> s.accept(this, param));

        ifElse.getCondition().getType().asBoolean();
        for (Statement st : ifElse.getBody()) {
            st.setReturnType(ifElse.getReturnType());
        }
        for (Statement st : ifElse.getBodyElse()) {
            st.setReturnType(ifElse.getReturnType());
        }

        return null;
    }

    @Override
    public Void visit(Return ret, Type param) {
        ret.setReturnType(param);
        ret.getReturnType().accept(this, param);
        ret.getReturnValue().accept(this, param);

        ret.getReturnValue().getType().returnedAs(ret.getReturnType());
        return null;
    }

    @Override
    public Void visit(WhileLoop whileLoop, Type param) {
        whileLoop.getCondition().accept(this, param);
        whileLoop.getBody().forEach(statement -> statement.accept(this, param));

        whileLoop.getCondition().getType().asBoolean();
        for (Statement st : whileLoop.getBody()) {
            st.setReturnType(whileLoop.getReturnType());
        }
        return null;
    }

    @Override
    public Void visit(Write write, Type param) {
        write.getWriteVal().accept(this, param);

        write.getWriteVal().getType().written();

        return null;
    }

    @Override
    public Void visit(Assignment assignment, Type param) {
        assignment.getLHS().accept(this, param);
        assignment.getRHS().accept(this, param);

        if (!assignment.getLHS().getLvalue()) {
            new ErrorType(assignment.getLHS().getLine(), assignment.getLHS().getColumn(), "L-value required on assignment.");
        }
        if (!assignment.getLHS().getType().equals(assignment.getRHS().getType())) {
            new ErrorType(assignment.getLHS().getLine(), assignment.getLHS().getColumn(), "Assignment types do not match.");
        }
        return null;
    }

    @Override
    public Void visit(Read read, Type param) {
        read.getReadVal().accept(this, param);
        if (!read.getReadVal().getLvalue()) {
            new ErrorType(read.getReadVal().getLine(), read.getReadVal().getColumn(), "L-value required on read.");
        }
        return null;
    }

    @Override
    public Void visit(Variable variable, Type param) {
        variable.setLvalue(true);
        return null;
    }

}
