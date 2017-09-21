grammar DistributeRule;


root
    : (statement)+
    ;

statement returns [boolean result]
    : left=expression op=('=' | '>' | '>=' | '<' | '<=' ) right=expression
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
   | token        #atomToken
   | LPAREN expression RPAREN # paren
   | LPAREN token RPAREN #parenToken
   ;

number
   : MINUS? DIGIT + (POINT DIGIT +)?
   ;

token
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
