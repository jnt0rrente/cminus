package ast.type;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public class ArrayType extends AbstractASTNode implements Type {
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

    // for the record, I am aware this is unorthodox to say the least,
    // but I'd rather use this than have my arrays inverted.
    public void setType(Type type) {
        if (this.elementType instanceof ArrayType) {
            ((ArrayType) this.elementType).setType(type);
        } else {
            this.elementType = type;
        }
    }
}
