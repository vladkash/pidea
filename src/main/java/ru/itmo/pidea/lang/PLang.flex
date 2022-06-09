package com.github.vladkash.pidea.lang.lexer;

import ru.itmo.pidea.lang.psi.PLangTypes;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
%%

%public
%class PLangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode


LINE_WS = [\ \t\f]+
EOL = "\r"|"\n"|"\r\n"
WHITE_SPACE=({LINE_WS}|{EOL})+

ALPHA_NUM = [a-zA-Z0-9]
IDENTIFIER = [a-z] {ALPHA_NUM}*
VARIABLE =   [A-Z] {ALPHA_NUM}*

%state GOAL

%%

{WHITE_SPACE}    { return WHITE_SPACE; }

"("           { return PLangTypes.LPAREN; }
")"           { return PLangTypes.RPAREN; }
"?"           { yybegin(GOAL); return PLangTypes.QUESTION; }
"."           { yybegin(YYINITIAL); return PLangTypes.DOT; }
":-"           { return PLangTypes.SEPARATOR; }
","           { return PLangTypes.COMMA; }
";"           { return PLangTypes.SEMICOLON; }
"true"           { return PLangTypes.TRUE; }
"false"           { return PLangTypes.FALSE; }

{VARIABLE}             { return PLangTypes.VARIABLE; }

<YYINITIAL> {
    {IDENTIFIER}             {  yybegin(GOAL); return PLangTypes.IDENTIFIER_DEF; }
}

<GOAL> {
    {IDENTIFIER}             { return PLangTypes.IDENTIFIER_CALL; }
}

[^] { return BAD_CHARACTER; }