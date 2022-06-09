package ru.itmo.pidea.lang;

import com.github.vladkash.pidea.lang.lexer.PLangLexer;
import com.intellij.lexer.FlexAdapter;

public class PLangLexerAdapter extends FlexAdapter {
    public PLangLexerAdapter() {
        super(new PLangLexer(null));
    }
}