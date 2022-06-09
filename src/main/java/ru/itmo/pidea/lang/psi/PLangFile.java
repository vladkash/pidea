package ru.itmo.pidea.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import ru.itmo.pidea.lang.PLangFileType;
import ru.itmo.pidea.lang.PLanguage;

public class PLangFile extends PsiFileBase {

    public PLangFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PLangFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "PLang File";
    }

}