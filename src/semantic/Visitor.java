package semantic;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.Assignment;

public interface Visitor<TP, TR> {
    TR visit(Program program, TP param);

    TR visit(Assignment program, TP param);

    TR visit(Variable program, TP param);

    TR visit(Arithmetic arithmetic, TP param);

    TR visit(Cast cast, TP param);

    TR visit(CharLiteral charLiteral, TP param);

    TR visit(Comparison comparison, TP param);

    TR visit(FieldAccess fieldAccess, TP param);

    TR visit(FunctionInvocation functionInvocation, TP param);

    TR visit(Indexing indexing, TP param);

    TR visit(IntLiteral intLiteral, TP param);

    TR visit(Logical logical, TP param);

    TR visit(RealLiteral realLiteral, TP param);

    TR visit(UnaryMinus unaryMinus, TP param);

    TR visit(UnaryNot unaryNot, TP param);

    TR visit(FunctionDefinition functionDefinition, TP param);

    TR visit(VariableDefinition variableDefinition, TP param);
}

