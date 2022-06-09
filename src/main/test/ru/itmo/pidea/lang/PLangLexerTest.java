package ru.itmo.pidea.lang;

import com.intellij.lexer.Lexer;
import com.intellij.testFramework.LexerTestCase;
import org.jetbrains.annotations.NotNull;

public class PLangLexerTest extends LexerTestCase {

    public void testAllTokens() {
        doFileTest("plang");
    }

    @Override
    public Lexer createLexer() {
        return new PLangLexerAdapter();
    }

    @Override
    public String getDirPath() {
        return "src/main/test/ru/itmo/pidea/data/lexer";
    }

    @Override
    public @NotNull String getPathToTestDataFile(String extension)  {
        return this.getDirPath() + "/" + getTestName(true) + extension;
    }
}