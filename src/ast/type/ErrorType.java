package ast.type;

import ast.Type;
import errorhandler.ErrorHandler;
import semantic.Visitor;

import java.util.List;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error (" + getLine() + ":" + getColumn() + "): " + this.message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public String getTypeName() {
        return "ErrorType";
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public Type arithmetic(Type type2, int line, int column) {
        return this;
    }

    @Override
    public Type comparedTo(Type type2, int line, int column) {
        return this;
    }

    @Override
    public Type dot(String name, int line, int column) {
        return this;
    }

    @Override
    public Type parentheses(List<Type> argTypes, int line, int column) {
        return this;
    }

    @Override
    public Type squareBrackets(Type type2, int line, int column) {
        return this;
    }

    @Override
    public Type logical(Type type2, int line, int column) {
        return this;
    }

    @Override
    public Type unaryMinus(int line, int column) {
        return this;
    }

    @Override
    public Type unaryNot(int line, int column) {
        return this;
    }

    @Override
    public Type castTo(Type type2, int line, int column) {
        return this;
    }

    @Override
    public void returnedAs(Type type2, int line, int column) {
    }

    @Override
    public void asBoolean(int line, int column) {
    }

    @Override
    public void written(int line, int column) {
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
