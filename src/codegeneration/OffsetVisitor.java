package codegeneration;

import ast.Definition;
import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.type.FunctionType;
import ast.type.RecordField;
import ast.type.StructType;
import semantic.AbstractVisitor;

//
//        P: 	Program -> definition*
//        R1: 	int globalsBytesSum = 0;
//              for (Definition def : definition*) {
//                  if (definition instanceof VariableDefinition varDef)
//
//                  varDef.offset = globalsBytesSum;
//                  globalsBytesSum += varDef.type.numberOfBytes();
//              }
//
//        P: 	FunctionDefinition -> type ID variableDefinition* statement*
//        R1:   int localsBytesSum = 0;
//              for (VariableDefinition varDef : variableDefinition*) {
//                  localsBytesSum += varDef.type.numberOfBytes();
//                  varDef.offset = -localsBytesSum;
//              }
//
//
//
//
//        P: 	FunctionType -> type variableDefinition*
//        R2:	int paramsOnTheRightBytesSum = 0;
//              for (int i = variableDefinition*.size()-1; i > 0; i--) {
//                  VariableDefinition param = variableDefinition*.get(i);
//                  param.offset = 4 + paramsOnTheRightBytesSum;
//                  paramsOnTheRightBytesSum += param.type.numberOfBytes();
//              }
//
//
//
//
//        P:	StructType -> recordField*
//        R1:	int fieldsBytesSum = 0;
//              for (RecordField rf : recordField*) {
//                  rf.offset = fieldsBytesSum;
//                  fieldsBytesSum += rf.type.numberOfBytes();
//              }
//
public class OffsetVisitor extends AbstractVisitor<Void, Void> {
    @Override
    public Void visit(Program program, Void param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));

        int globalsBytesSum = 0;
        for (Definition def : program.getDefinitions()) {
            if (def instanceof VariableDefinition) {
                VariableDefinition varDef = (VariableDefinition) def;
                varDef.setOffset(globalsBytesSum);
                globalsBytesSum += def.getType().numberOfBytes();
            }
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        functionDefinition.getBodyStatements().forEach(def -> def.accept(this,param));
        functionDefinition.getBodyVariableDefinitions().forEach(def -> def.accept(this, param));
        functionDefinition.getType().accept(this,param);

        int localsBytesSum = 0;
        for (VariableDefinition variableDefinition : functionDefinition.getBodyVariableDefinitions()) {
            localsBytesSum += variableDefinition.getType().numberOfBytes();
            variableDefinition.setOffset(-localsBytesSum);
        }

        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        functionType.getParameterVariableDefinitions().forEach(variableDefinition -> variableDefinition.accept(this, param));
        functionType.getReturnType().accept(this,param);

        int paramsOnTheRightBytesSum = 0;
        for (int i = functionType.getParameterVariableDefinitions().size()-1; i >= 0 ; i--) {
            VariableDefinition variableDefinition = functionType.getParameterVariableDefinitions().get(i);
            variableDefinition.setOffset(4 + paramsOnTheRightBytesSum);
            paramsOnTheRightBytesSum += variableDefinition.getType().numberOfBytes();
        }

        return null;
    }

    //        P:	StructType -> recordField*
//        R1:	int fieldsBytesSum = 0;
//              for (RecordField rf : recordField*) {
//                  rf.offset = fieldsBytesSum;
//                  fieldsBytesSum += rf.type.numberOfBytes();
//              }

    @Override
    public Void visit(StructType structType, Void param) {
        //structType.getRecords().forEach(recordField -> recordField.accept(this,param));

        int fieldsBytesSum = 0;
        for (RecordField recordField : structType.getRecords()) {
            recordField.setOffset(fieldsBytesSum);
            fieldsBytesSum += recordField.getType().numberOfBytes();
        }

        return null;
    }
}
