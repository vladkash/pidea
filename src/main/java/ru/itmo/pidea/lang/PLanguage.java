package ru.itmo.pidea.lang;

import com.intellij.lang.Language;

public class PLanguage extends Language {

    public static final PLanguage INSTANCE = new PLanguage();

    private PLanguage() {
        super("PLang");
    }

}
