package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class DoubleType extends AbstractType {
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Double builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type arithmetic(Type type2, int line, int column) {
        if (type2 instanceof DoubleType) return new DoubleType(this.getLine(),this.getColumn());
        if (type2 instanceof IntType) return new DoubleType(this.getLine(),this.getColumn());

        return super.arithmetic(type2, line, column);
    }

    @Override
    public Type comparedTo(Type type2, int line, int column) {
        if (type2 instanceof DoubleType) return new BooleanType(line, column);
        if (type2 instanceof IntType) return new IntType(line, column);

        return super.comparedTo(type2, line, column);
    }

    @Override
    public Type unaryMinus(int line, int column) {
        return this;
    }

    @Override
    public String getTypeName() {
        return "DoubleType";
    }

    @Override
    public void written(int line, int column) {

    }

    @Override
    public Type castTo(Type type2, int line, int column) {
        if (type2 instanceof IntType) return type2;
        if (type2 instanceof DoubleType) return this;
        if (type2 instanceof CharType) return type2;
        return super.castTo(type2, line, column);
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public String convertTo(Type type) {
        if (type instanceof IntType) {
            return "f2i";
        } else if (type instanceof CharType) {
            return "f2i,i2b";
        }
        return "";
    }
}
