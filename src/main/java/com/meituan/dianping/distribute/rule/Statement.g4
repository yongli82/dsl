grammar Statement;

statement returns [double result]
    : expression
    ;

expression
    : left=expression op=(PLUS | MINUS) right=multiplyingExpression #plusOrMinus
    | multiplyingExpression                                         #singlePlusOrMinus
    ;

multiplyingExpression
    : left=multiplyingExpression op=(TIMES | DIV) right=atomExpression #timesOrDiv
    | atomExpression                                                   #singleTimesOrDiv
    ;

atomExpression
   : number       #atomNumber
   | variable        #atomToken
   | LPAREN variable RPAREN #parenToken
   | LPAREN expression RPAREN # paren
   ;

number
   : MINUS? DIGIT + (POINT DIGIT +)?
   ;

variable
   : label ('+'|'-')?
   ;

label
   : 'S' | 'A' | 'B' | 'C'
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

TIMES
   : '*'
   ;

DIV
   : '/'
   ;

POINT
   : '.'
   ;

LETTER
    : ('a' .. 'z') | ('A' .. 'Z')
    ;

DIGIT
    : ('0' .. '9')
    ;

COMMA
    : ','
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

NEWLINE
    : '\r'? '\n' -> skip
    ;

SEMICOLON
    : ';'
    ;
