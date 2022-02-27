grammar Cmm;	

program: (variable_definition|function_definition)*  'void' 'main' '('  ')' '{' function_body '}' EOF
       ;

expression: '(' expression ')'
	| expression '[' expression ']'
	| expression '.' ID
	| '(' builtin_type ')' expression
	| '-' expression
	| '!' expression
	| expression ('*'|'/'|'%') expression
	| expression ('+'|'-') expression
	| expression ('>'|'>='|'<'|'<='|'!='|'==') expression
	| expression ('&&'|'||') expression
	| function_invocation
	| ID
	| INT_CONSTANT
	| REAL_CONSTANT
	| CHAR_CONSTANT
	;

statement: expression '=' expression ';'
	| 'while' '(' expression ')' block
	| 'if' '(' expression ')' block ('else' block)?
	| 'return' expression ';'
	| 'read' (expression (',' expression)*) ';'
	| 'write' (expression (',' expression)*) ';' //write 't', 'r', 'u', 'e', '\n';
	| function_invocation ';'
	;

type: builtin_type
	| 'struct' '{' record_field* '}'//structs can be empty
	| type '[' INT_CONSTANT ']'
	;

record_field: type (ID (',' ID)*) ';' //refactored for clarity
	;

variable_definition: type (ID (',' ID)*) ';'
	;

function_definition: (builtin_type|'void') ID      '(' (type ID(',' type ID)*)? ')'        '{' function_body '}'
	;

function_body: variable_definition* statement*
	;

function_invocation: ID '(' (expression (',' expression)*)? ')'
	;

builtin_type: 'int'
	| 'double'
	| 'char'
	;

block: '{' statement* '}'
	| statement
	;

WS: [ \n\t\r]+ -> skip
	;

ID: [a-zA-Z_][a-zA-Z0-9_]*
    ;

INT_CONSTANT: '0'
            | [1-9][0-9]*
            ;

CHAR_CONSTANT: '\''.'\''
            | '\'\\\''
            | '\'\\\'\''
            | '\'\\'INT_CONSTANT'\''
            | '\'\\'[ntr]'\''
            ;

REAL_CONSTANT: (REAL_CONSTANT_MANTISSA|INT_CONSTANT) ([eE]   ('-'|'+')?  INT_CONSTANT)?
			;

REAL_CONSTANT_MANTISSA: INT_CONSTANT '.'
            | '.' [0-9]+
            | INT_CONSTANT '.' [0-9]+
            ;

MULTI_LINE_COMMENT: '/*'.*?'*/' -> skip;


SINGLE_LINE_COMMENT: '//'.*?('\n'|EOF) -> skip;