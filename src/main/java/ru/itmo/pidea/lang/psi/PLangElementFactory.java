package ru.itmo.pidea.lang.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import ru.itmo.pidea.lang.PLanguage;

public class PLangElementFactory {
    public static PLangRelationDef createProperty(Project project, String newName) {
        return (PLangRelationDef) PsiFileFactory.getInstance(project).createFileFromText(PLanguage.INSTANCE, newName).getFirstChild();
    }
}
