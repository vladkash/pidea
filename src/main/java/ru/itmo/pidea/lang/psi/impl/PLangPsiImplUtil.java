package ru.itmo.pidea.lang.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import ru.itmo.pidea.lang.PLangRelationCallReference;
import ru.itmo.pidea.lang.psi.PLangElementFactory;
import ru.itmo.pidea.lang.psi.PLangRelation;
import ru.itmo.pidea.lang.psi.PLangRelationCall;
import ru.itmo.pidea.lang.psi.PLangRelationDef;

public class PLangPsiImplUtil {

    public static String getName(PLangRelation element) {
        return element.getFirstChild().getFirstChild().getText();
    }

    public static PsiReference getReference(PLangRelationCall element) {
        return new PLangRelationCallReference(element);
    }

}