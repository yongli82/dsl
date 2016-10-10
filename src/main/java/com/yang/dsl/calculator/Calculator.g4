grammar Calculator;
/* 增加赋值语句，最后一行表达式返回的值为最终值 */

root: (assign)* expression;

assign: variable '=' expression (';')? NEWLINE     # assignVariable
   |  NEWLINE  # blank
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
   | variable     #atomVariable
   | LPAREN expression RPAREN # paren
   | funcExpression #atomFunction
   ;

funcExpression
    : funcname LPAREN expression (COMMA expression)* RPAREN
    ;

funcname
   : 'SUM'
   | 'AVE'
   | 'CELL'
   | 'FLOOR'
   ;

number
   : MINUS? DIGIT + (POINT DIGIT +)?
   ;

variable
   : MINUS? LETTER (LETTER | DIGIT)*
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

NEWLINE
    : '\r'? '\n'
    ;
WS
    : [ \t]+ -> skip
    ;