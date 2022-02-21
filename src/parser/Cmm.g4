grammar Cmm;	

program: (CHAR_CONSTANT|WS|INT_CONSTANT|MULTI_LINE_COMMENT|REAL_CONSTANT|ID|SINGLE_LINE_COMMENT)*
       ;


WS: [ \n\t\r]+
    -> skip;

ID: ('_'?([a-z]|[A-Z])+'_'?INT_CONSTANT*'_'?)+
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

REAL_CONSTANT: INT_CONSTANT+'.'INT_CONSTANT*
            | INT_CONSTANT*'.'INT_CONSTANT+
            | INT_CONSTANT*'.'INT_CONSTANT+[eE]'-'?INT_CONSTANT
            | INT_CONSTANT+'.'INT_CONSTANT*[eE]'-'?INT_CONSTANT
            | INT_CONSTANT+[eE]'-'?INT_CONSTANT
            ;

MULTI_LINE_COMMENT: '/*'.*?'*/' -> skip;


SINGLE_LINE_COMMENT: '//'.*?('\n'|EOF) -> skip;