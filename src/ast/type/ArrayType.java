package ast.type;

import ast.Expression;
import ast.Type;
import semantic.Visitor;

public class ArrayType extends AbstractType {
    public Expression size;
    public Type elementType;

    public ArrayType(int line, int column, Expression size, Type elementType) {
        super(line,column);
        this.size = size;
        this.elementType = elementType;
    }

    @Override
    public String toString() {
        return "Array [type: " + elementType + " size: " + size + "]";
    }

    public void setType(Type type) {
        if (this.elementType instanceof ArrayType) {
            ((ArrayType) this.elementType).setType(type);
        } else {
            this.elementType = type;
        }
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public Type squareBrackets(Type type2) {
        if (type2 instanceof IntType) {
            return this.elementType;
        } else {
            return super.squareBrackets(type2);
        }
    }

    @Override
    public String getTypeName() {
        return "ArrayType";
    }

    @Override
    public int numberOfBytes() {
        return elementType.numberOfBytes() * size.value;
    }

    public Expression getSize() {
        return size;
    }

    public void setSize(Expression size) {
        this.size = size;
    }

    public Type getElementType() {
        return elementType;
    }

    public void setElementType(Type elementType) {
        this.elementType = elementType;
    }
}
