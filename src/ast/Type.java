package ast;

import java.util.List;

public interface Type extends ASTNode {
    public Type arithmetic(Type type2);

    public Type castTo(Type type2);

    public Type comparedTo(Type type2);

    public Type dot(String name);

    public Type parentheses(List<Type> argTypes);

    public Type squareBrackets(Type type2);

    public Type logical(Type type2);

    public Type unaryMinus();

    public Type unaryNot();

    public String getTypeName();

    public void asBoolean();

    public void returnedAs(Type returnType);

    public void written();

    public int numberOfBytes();

    public char suffix();

    String convertTo(Type type);

    String promoteTo(Type type);
}
