package ru.itmo.pidea.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class PLangNamedElementImpl extends ASTWrapperPsiElement implements PLangNamedElement {

    public PLangNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
