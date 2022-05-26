package codegeneration;

import ast.Expression;
import ast.expression.*;
import ast.type.CharType;

/**
 * value[[Indexing: expression1 -> expression2 expression3]] =
 *     address[[expression1]]
 *     <load> expression1.type.suffix()
 *
 * value[[FieldAccess: expression1 -> expression2 ID]] =
 *     address[[expression1]]
 *     <load> expression1.type.suffix()
 *
 * value[[FunctionInvocation: expression1 -> expression2 expression3*]] =
 *     for (Expression exp : expression3*) {
 *         value[[exp]]
 *     }
 *     <call > expression2.getIdentifier();
 *
 * value[[Cast: expression1 -> type expression2]] =
 *     value[[expression2]]
 *     cg.convertTypes(expression1, expression2);
 *
 * value[[Comparison: expression1 -> expression2 expression3]] =
 *     value[[expression2]]
 *     if (!expression2.type.promotesTo(expression1.type)) error()
 *     value[[expression3]]
 *     cg.convertTypes(expression3, expression1);
 *     cg.comparison(expression1.operator)
 *
 * value[[Logical: expression1 -> expression2 expression3]] =
 *     value[[expression2]]
 *     value[[expression3]]
 *     cg.logical(expression1.operator)
 *
 * value[[Variable: expression1 -> ID]] =
 *     address[[expression1]]
 *     <load> expression1.type.suffix
 *
 * value[[Arithmetic: expression1 -> expression2 expression3]] =
 *     value[[expression2]]
 *     cg.convertTypes(expression2, expression1);
 *     value[[expression3]]
 *     cg.convertTypes(expression3, expression1);
 *     cg.arithmetic(expression1.operator)
 *
 * value[[CharLiteral: expression1 -> charLiteral]] =
 *     <push> expression1.type.suffix() charLiteral.value
 *
 * value[[IntLiteral: expression1 -> intLiteral]] =
 *     <push> expression1.type.suffix() intLiteral.value
 *
 * value[[RealLiteral: expression1 -> doubleLiteral]] =
 *     <push> expression1.type.suffix() doubleLiteral.value
 *
 * value[[UnaryMinus: expression1 -> expression2]] =
 *     value[[expression2]]
 *     <push> expression1.type.suffix <-1>
 *     <mul> expression1.type.suffix
 *
 * value[[UnaryNot: expression1 -> expression2]] =
 *     value[[expression2]]
 *     <not>
 *
 */
public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
    AddressCGVisitor addressCGVisitor;
    CodeGenerator cg = CodeGenerator.getInstance();

    public ValueCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.accept(addressCGVisitor, param);
        cg.load(fieldAccess.getType().suffix());
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.accept(addressCGVisitor, param);
        cg.load(indexing.getType().suffix());
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        cg.convert(cast.getExpression().getType().convertTo(cast.getType()));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.getOperand1().accept(this, param);
        comparison.getOperand1().getType().promoteTo(comparison.getType()); //does nothing when real -> int and prints b2i when byte -> int
        comparison.getOperand2().accept(this, param);
        cg.convert(comparison.getOperand2().getType().promoteTo(comparison.getType()));

        switch (comparison.getOperator()) {
            case ">":
                cg.gt(cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "<":
                cg.lt(cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case ">=":
                cg.ge(cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "<=":
                cg.le(cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "==":
                cg.eq(cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "!=":
                cg.ne(cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
        }

        return null;
    }

    @Override
    public Void visit(Logical logical, Void param) {
        logical.getOperand1().accept(this, param);
        logical.getOperand2().accept(this, param);

        switch (logical.getOperator()) {
            case "&&":
                cg.and();
                break;
            case "||":
                cg.or();
                break;
        }

        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        addressCGVisitor.visit(variable, param);
        cg.load(variable.getType().suffix());
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getOperand1().accept(this, param);
        cg.convert(arithmetic.getOperand1().getType().convertTo(arithmetic.getType()));
        arithmetic.getOperand2().accept(this, param);
        cg.convert(arithmetic.getOperand2().getType().convertTo(arithmetic.getType()));

        switch (arithmetic.getOperator()) {
            case '+':
                cg.add(arithmetic.getType().suffix());
                break;
            case '-':
                cg.sub(arithmetic.getType().suffix());
                break;
            case '*':
                cg.mul(arithmetic.getType().suffix());
                break;
            case '/':
                cg.div(arithmetic.getType().suffix());
                break;
            case '%':
                cg.mod('i');
                break;
        }
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        cg.push(charLiteral.getType().suffix(), "" + (int) charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        cg.push(intLiteral.getType().suffix(), "" + intLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(RealLiteral realLiteral, Void param) {
        cg.push(realLiteral.getType().suffix(), "" + realLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getTarget().accept(this, param);
        cg.push(unaryMinus.getType().suffix(), "-1");
        cg.mul(unaryMinus.getType().suffix());
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getTarget().accept(this, param);
        cg.not();
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        for (Expression exp : functionInvocation.getParameters()) {
            exp.accept(this, param);
        }
        cg.call(functionInvocation.getVariable().getIdentifier(), true);
        return null;
    }
}
