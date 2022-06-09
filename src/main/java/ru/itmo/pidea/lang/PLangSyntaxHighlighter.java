package ru.itmo.pidea.lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.itmo.pidea.lang.psi.PLangTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PLangSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("PLang_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);

    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("PLang_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey DOT =
            createTextAttributesKey("PLang_DOT", DefaultLanguageHighlighterColors.DOT);

    public static final TextAttributesKey RELATION_DECLARATION =
            createTextAttributesKey("PLang_RELATION_DECLARATION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);

    public static final TextAttributesKey RELATION_CALL =
            createTextAttributesKey("PLang_RELATION_CALL", DefaultLanguageHighlighterColors.STATIC_METHOD);

    public static final TextAttributesKey VARIABLE =
            createTextAttributesKey("PLang_VARIABLE", DefaultLanguageHighlighterColors.REASSIGNED_LOCAL_VARIABLE);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("PLang_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};
    private static final TextAttributesKey[] RELATION_DECLARATION_KEYS = new TextAttributesKey[]{RELATION_DECLARATION};
    private static final TextAttributesKey[] RELATION_CALL_KEYS = new TextAttributesKey[]{RELATION_CALL};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PLangLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(PLangTypes.LPAREN) || tokenType.equals(PLangTypes.RPAREN)) {
            return PARENTHESES_KEYS;
        }

        if (
                tokenType.equals(PLangTypes.QUESTION)
                        || tokenType.equals(PLangTypes.SEPARATOR)
                        || tokenType.equals(PLangTypes.TRUE)
                        || tokenType.equals(PLangTypes.FALSE)
                        || tokenType.equals(PLangTypes.COMMA)
                        || tokenType.equals(PLangTypes.SEMICOLON)
        ) {
            return KEYWORD_KEYS;
        }

        if (tokenType.equals(PLangTypes.DOT)) {
            return DOT_KEYS;
        }

        if (tokenType.equals(PLangTypes.IDENTIFIER_DEF)) {
            return RELATION_DECLARATION_KEYS;
        }

        if (tokenType.equals(PLangTypes.IDENTIFIER_CALL)) {
            return RELATION_CALL_KEYS;
        }

        if (tokenType.equals(PLangTypes.VARIABLE)) {
            return VARIABLE_KEYS;
        }

        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}
