package ast.type;

import ast.Type;
import semantic.Visitor;

public class BooleanType extends AbstractType {

    public BooleanType(int line, int column) { super(line, column); }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public String getTypeName() {
        return "BooleanType";
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public Type logical(Type type2, int line, int column) {
        if (type2 instanceof BooleanType) return this;

        return super.logical(type2, line, column);
    }

    @Override
    public void isBoolean(int line, int column) {

    }

    @Override
    public void written(int line, int column) {

    }

    @Override
    public Type unaryNot(int line, int column) {
        return new BooleanType(line, column);
    }

    @Override
    public String toString() {
        return "Boolean builtin";
    }

    @Override
    public char suffix() {
        return 'i';
    }
}
