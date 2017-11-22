grammar Accounting;
/*
 出账DSL:
 1. 基本四则运算，括号 + - * / ()
 2. 基本数学函数SUM, MAX, MIN, AVERAGE
 3. 支持赋值语句
 4. 使用return 返回结果
 5. 支持if/ else, 支持值的大小比较 == > >= < <= != <>
 6. 支持for
 7. 支持外部函数
 8. 支持多行，使用";"或 换行分隔表达式
 10. 变量支持中文
 */

start: '='? methodBody;

methodBody
    : block
    ;

block
    : (blockStatement)* returnStatement?
    ;

blockStatement
    :   assign (SEMICOLON| NEWLINE)?
    |   statement (SEMICOLON| NEWLINE)?
    |   expression (SEMICOLON| NEWLINE)?
    ;

statement
    :   ifBranch (elseIfBranch)* (elseBranch)? (SEMICOLON| NEWLINE)? #ifelseStatement
    |   'for' '(' forControl ')' '{' block '}' (SEMICOLON| NEWLINE)? #forStatement
    ;

ifBranch returns [boolean isMatch]
    :   'if' '(' judgeExpression ')' '{' block '}'
    ;

elseIfBranch returns [boolean isMatch]
    :   'else' 'if' '(' judgeExpression ')' '{' block '}'
    ;

elseBranch returns [boolean isMatch]
    :   'else' '{' noblock=block '}'
    ;

returnStatement
    : 'return' expression? (SEMICOLON| NEWLINE)?
    ;

forControl
    : forInit? SEMICOLON judgeExpression? SEMICOLON forUpdate?
    ;

forInit
    : assign
    ;

forUpdate
    : assign
    ;

expressionList
    :   expression (',' expression)*
    ;

judgeExpression returns [boolean result]
    : left=atomExpression op=('==' | '>' | '>=' | '<' | '<=' | '<>' | '!=' ) right=atomExpression
    | TRUE
    | FALSE
    | judgeExpression AND judgeExpression
    | judgeExpression OR judgeExpression
    ;

assign: identifier EQUAL expression (SEMICOLON| NEWLINE)?# assignVariable
    ;

expression
    : left=expression op=(PLUS | MINUS) right=multiplyingExpression #plusOrMinus
    | multiplyingExpression                                         #singlePlusOrMinus
    | judgeExpression                                             #booleanNumber
    ;

multiplyingExpression
    : left=multiplyingExpression op=(TIMES | DIV) right=atomExpression #timesOrDiv
    | atomExpression                                                   #singleTimesOrDiv
    ;

atomExpression
   : number         #atomNumber
   | identifier     #atomVariable
   | LPAREN expression RPAREN # paren
   | funcExpression  #atomFunction
   | outerFunction   #outerFunctionExpression
   ;

funcExpression
    : innerFunctionName LPAREN expression (COMMA expression)* RPAREN
    ;

innerFunctionName
   : 'SUM'
   | 'AVERAGE'
   | 'MAX'
   | 'MIN'
   | 'SIGNAL'
   ;

outerFunction
    : identifier LPAREN (parameter (COMMA parameter)*)? RPAREN
    ;

parameter
    : expression      #parameterExpression
    | string          #parameterString
    ;

string returns [String value]
    : '"' identifier '"'
    ;

number
   : MINUS? DIGIT + (POINT DIGIT +)?
   ;

EQUAL
    : '='
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


// §3.9 Keywords

ABSTRACT      : 'abstract';
ASSERT        : 'assert';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';
TRUE          : 'true' | 'TRUE' | 'True';
FALSE         : 'false' | 'FALSE' | 'False';
AND           : 'and' | 'AND' | 'And';
OR            : 'or' | 'OR' | 'or';


// §3.8 Identifiers (must appear after all keywords in the grammar)

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

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

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
    : ';' -> skip
    ;
