package ru.itmo.pidea.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PLangFileType extends LanguageFileType {

    public static final PLangFileType INSTANCE = new PLangFileType();

    private PLangFileType() {
        super(PLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "PLang File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "P language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "plang";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }

}
