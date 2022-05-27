package ast;

import java.util.List;

public interface Type extends ASTNode {
    public Type arithmetic(Type type2, int line, int column);

    public Type castTo(Type type2, int line, int column);

    public Type comparedTo(Type type2, int line, int column);

    public Type dot(String name, int line, int column);

    public Type parentheses(List<Type> argTypes, int line, int column);

    public Type squareBrackets(Type type2, int line, int column);

    public Type logical(Type type2, int line, int column);

    public Type unaryMinus(int line, int column);

    public Type unaryNot(int line, int column);

    public String getTypeName();

    public void isBoolean(int line, int column);

    public void returnedAs(Type returnType, int line, int column);

    public void written(int line, int column);

    public int numberOfBytes();

    public char suffix();

    String convertTo(Type type);

    String promoteTo(Type type);
}
