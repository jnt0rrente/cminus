package codegeneration;

import ast.expression.*;

/**
 * value[[Indexing: expression1 -> expression2 expression3]] =
 *     address[[expression1]]
 *     <load > expression1.type.suffix()
 *
 * value[[FieldAccess: expression1 -> expression2 ID]] =
 *      address[[expression1]]
 *      <load > expression1.type.suffix()
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
        cg.writeTabbedInstruction("load" + fieldAccess.getType().suffix());
        return null;
    }

    @Override
    public Void visit(Indexing indexing, Void param) {
        indexing.accept(addressCGVisitor, param);
        cg.writeTabbedInstruction("load" + indexing.getType().suffix());
        return null;
    }

    @Override
    public Void visit(Cast cast, Void param) {
        cast.getExpression().accept(this, param);
        cg.writeTabbedConvertInstruction(cast.getExpression().getType().convertTo(cast.getType()));
        return null;
    }

    @Override
    public Void visit(Comparison comparison, Void param) {
        comparison.getOperand1().accept(this, param);
        comparison.getOperand1().getType().promoteTo(comparison.getType()); //does nothing when real -> int and prints b2i when byte -> int
        comparison.getOperand2().accept(this, param);
        cg.writeTabbedInstruction(comparison.getOperand2().getType().promoteTo(comparison.getType()));

        switch (comparison.getOperator()) {
            case ">":
                cg.writeTabbedInstruction("gt" + cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "<":
                cg.writeTabbedInstruction("lt" + cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case ">=":
                cg.writeTabbedInstruction("ge" + cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "<=":
                cg.writeTabbedInstruction("le" + cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "==":
                cg.writeTabbedInstruction("eq" + cg.minIntSuffix(comparison.getOperand1().getType()));
                break;
            case "!=":
                cg.writeTabbedInstruction("ne" + cg.minIntSuffix(comparison.getOperand1().getType()));
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
                cg.writeTabbedInstruction("and");
                break;
            case "||":
                cg.writeTabbedInstruction("or");
                break;
        }

        return null;
    }

    @Override
    public Void visit(Variable variable, Void param) {
        addressCGVisitor.visit(variable, param);
        cg.writeTabbedInstruction("load" + variable.getType().suffix());
        return null;
    }

    @Override
    public Void visit(Arithmetic arithmetic, Void param) {
        arithmetic.getOperand1().accept(this, param);
        cg.writeTabbedInstruction(arithmetic.getOperand1().getType().convertTo(arithmetic.getType()));
        arithmetic.getOperand2().accept(this, param);
        cg.writeTabbedInstruction(arithmetic.getOperand2().getType().convertTo(arithmetic.getType()));

        switch (arithmetic.getOperator()) {
            case '+':
                cg.writeTabbedInstruction("add" + arithmetic.getType().suffix());
                break;
            case '-':
                cg.writeTabbedInstruction("sub" + arithmetic.getType().suffix());
                break;
            case '*':
                cg.writeTabbedInstruction("mul" + arithmetic.getType().suffix());
                break;
            case '/':
                cg.writeTabbedInstruction("div" + arithmetic.getType().suffix());
                break;
            case '%':
                cg.writeTabbedInstruction("modi");
                break;
        }
        return null;
    }

    @Override
    public Void visit(CharLiteral charLiteral, Void param) {
        cg.writeTabbedInstruction("pushb " + (int) charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(IntLiteral intLiteral, Void param) {
        cg.writeTabbedInstruction("pushi " + intLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(RealLiteral realLiteral, Void param) {
        cg.writeTabbedInstruction("pushf " + realLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(UnaryMinus unaryMinus, Void param) {
        unaryMinus.getTarget().accept(this, param);
        cg.writeTabbedInstruction("pushi -1");
        cg.writeTabbedInstruction("muli");
        return null;
    }

    @Override
    public Void visit(UnaryNot unaryNot, Void param) {
        unaryNot.getTarget().accept(this, param);
        cg.writeTabbedInstruction("not");
        return null;
    }


}
