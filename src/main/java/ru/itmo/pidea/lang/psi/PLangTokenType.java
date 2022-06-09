package ru.itmo.pidea.lang.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.itmo.pidea.lang.PLanguage;

public class PLangTokenType extends IElementType {

    public PLangTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PLangTokenType." + super.toString();
    }

}