package ru.itmo.pidea.lang;

import com.intellij.testFramework.ParsingTestCase;

public class PLangParserTest extends ParsingTestCase {

    public PLangParserTest() {
        super("", "plang", new PLangParserDefinition());
    }

    @Override
    protected String getTestDataPath() {
        return "src/main/test/ru/itmo/pidea/data/parser";
    }

    public void testNoRelations() {
        doTest(true, true);
    }

    public void testExample1() {
        doTest(true, true);
    }

    public void testExample2() {
        doTest(true, true);
    }

    public void testError1() {
        doTest(true, false);
    }

    public void testError2() {
        doTest(true, false);
    }

    public void testError3() {
        doTest(true, false);
    }

    public boolean skipSpaces()  {
        return true;
    }

    public boolean includeRanges() {
        return true;
    }
}
