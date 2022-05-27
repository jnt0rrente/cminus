package ast.type;

import ast.Type;
import ast.expression.IntLiteral;
import semantic.Visitor;


public class IntType extends AbstractType {
    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Int builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type arithmetic(Type type2, int line, int column) {
        if (type2 instanceof IntType) return new IntType(line, column);
        if (type2 instanceof DoubleType) return new DoubleType(line, column);

        return super.arithmetic(type2, line, column);
    }

    @Override
    public Type castTo(Type type2, int line, int column) {
        if (type2 instanceof CharType) return type2;
        if (type2 instanceof IntType) return this;
        if (type2 instanceof DoubleType) return type2;

        return super.castTo(type2, line, column);
    }

    @Override
    public Type comparedTo(Type type2, int line, int column) {
        if (type2 instanceof IntType) return new BooleanType(line, column);
        if (type2 instanceof DoubleType) return new BooleanType(line, column);
        if (type2 instanceof CharType) return new BooleanType(line, column);

        return super.comparedTo(type2, line, column);
    }

    @Override
    public Type unaryMinus(int line, int column) {
        return this;
    }

    @Override
    public String getTypeName() {
        return "IntType";
    }

    @Override
    public void returnedAs(Type type2, int line, int column) {
        if (type2 instanceof DoubleType) return;
        super.returnedAs(type2, line, column);
    }

    @Override
    public void written(int line, int column) {

    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public String convertTo(Type type) {
        if (type instanceof CharType) {
            return "i2b";
        } else if (type instanceof DoubleType) {
            return "i2f";
        }
        return "";
    }

    @Override
    public String promoteTo(Type type) {
        if (type instanceof DoubleType) {
            return "i2f";
        }
        else return "";
    }
}
