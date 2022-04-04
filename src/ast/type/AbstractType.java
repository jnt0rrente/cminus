package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {
    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public Type arithmetic(Type type2) {
        return new ErrorType(0, 0, String.format("Cannot use arithmetic operators on %s and %s.", this.getTypeName(), type2.getTypeName()));
    }

    @Override
    public Type comparedTo(Type type2) {
        return new ErrorType(0, 0, String.format("Cannot compare %s and %s.", this.getTypeName(), type2.getTypeName()));
    }

    @Override
    public Type dot(String name) {
        return new ErrorType(0, 0, String.format("Cannot field access %s.", this.getTypeName()));
    }

    @Override
    public Type parentheses(List<Type> argTypes) {
        return new ErrorType(0, 0, String.format("Cannot invoke %s.", this.getTypeName()));
    }

    @Override
    public Type squareBrackets(Type type2) {
        return new ErrorType(0, 0, String.format("Cannot index access %s with %s.", this.getTypeName(), type2.getTypeName()));
    }

    @Override
    public Type logical(Type type2) {
        return new ErrorType(0, 0, String.format("Cannot use logical operators on %s and %s.", this.getTypeName(), type2.getTypeName()));
    }

    @Override
    public Type unaryMinus() {
        return new ErrorType(0, 0, String.format("Cannot use unary minus on %s.", this.getTypeName()));
    }

    @Override
    public Type unaryNot() {
        return new ErrorType(0, 0, String.format("Cannot use unary not on %s.", this.getTypeName()));
    }

    @Override
    public Type castTo(Type type2) {
        return new ErrorType(0, 0, String.format("Cannot cast %s to %s.", this.getTypeName(), type2.getTypeName()));
    }

    @Override
    public void returnedAs(Type type2) {
        if (this.getClass().equals(type2.getClass())) return;
        new ErrorType(0, 0, String.format("Cannot return %s in place of %s.", this.getTypeName(), type2.getTypeName()));
    }

    @Override
    public void asBoolean() {
        new ErrorType(0,0,String.format("Cannot use %s as boolean condition.", this.getTypeName()));
    }

    @Override
    public void written() {
        new ErrorType(0,0, String.format("Cannot write %s.",this.getTypeName()));
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
