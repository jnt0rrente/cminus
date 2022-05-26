package ast.type;

import ast.Type;
import semantic.Visitor;

public class CharType extends AbstractType {
    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Char builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type castTo(Type type2, int line, int column) {
        if (type2 instanceof IntType) return type2;
        if (type2 instanceof DoubleType) return type2;
        if (type2 instanceof CharType) return this;
        return super.castTo(type2, line, column);
    }

    @Override
    public Type arithmetic(Type type2, int line, int column) {
        return new IntType(getLine(), getColumn());
    }

    @Override
    public String getTypeName() {
        return "CharType";
    }

    @Override
    public void returnedAs(Type type2, int line, int column) {
        if (type2 instanceof IntType) return;
        if (type2 instanceof DoubleType) return;
        super.returnedAs(type2, line, column);
    }

    @Override
    public void written(int line, int column) {

    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public String convertTo(Type type) {
        if (type instanceof IntType) {
            return "b2i";
        } if (type instanceof DoubleType) {
            return "b2i,i2f";
        }
        return "";
    }

    @Override
    public String promoteTo(Type type) {
        if (type instanceof DoubleType) {
            return "b2i";
        }
        else return "";
    }
}
