package semantic;

import ast.Definition;
import ast.Statement;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.type.ErrorType;
import ast.type.FunctionType;
import ast.type.StructType;
import semantic.symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<SymbolTable, Void>{

    @Override
    public Void visit(VariableDefinition definition, SymbolTable st) {
        if (st.findInCurrentScope(definition.getName()) != null) {
            new ErrorType(definition.getLine(), definition.getColumn(), "Variable '"+definition.getName()+"' already declared.");
            return null;
        }
        st.insert(definition);
        return null;
    }

    @Override
    public Void visit(FunctionDefinition definition, SymbolTable st) {
        if (st.findInCurrentScope(definition.getName()) != null) {
            new ErrorType(definition.getLine(), definition.getColumn(), "Function '"+definition.getName()+"' already declared");
            return null;
        }
        st.insert(definition);
        st.set();
        //definition.getBodyVariableDefinitions().forEach(st::insert);

        definition.getType().accept(this, st);
        definition.getBodyVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, st));
        definition.getBodyStatements().forEach(statement -> statement.accept(this, st));

        st.reset();

        return null;
    }

    @Override
    public Void visit(Variable variable, SymbolTable st) {
        Definition theDefinition = st.find(variable.getIdentifier());
        if (theDefinition == null) {
            new ErrorType(variable.getLine(), variable.getColumn(), "Undeclared variable '" + variable.getIdentifier()+"'");
        } else {
            variable.setDefinition(theDefinition);
        }
        return null;
    }


}
