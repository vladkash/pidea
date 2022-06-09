package ru.itmo.pidea.lang.psi;


import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.itmo.pidea.lang.PLanguage;

public class PLangElementType extends IElementType {
    public PLangElementType(@NotNull @NonNls String debugName) {
        super(debugName, PLanguage.INSTANCE);
    }

}