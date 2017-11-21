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
   : identifier('+'|'-')?
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

identifier
    : Identifier
    | LETTER
    ;

Identifier
    :  JavaLetter (JavaLetterOrDigit)*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;