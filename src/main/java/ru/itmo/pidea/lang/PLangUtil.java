package ru.itmo.pidea.lang;

import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.Nullable;
import ru.itmo.pidea.lang.psi.PLangRelation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PLangUtil {

    @Nullable
    public static List<PLangRelation> findRelations(PsiFile file, String key) {
        var relations = findRelations(file);

        return relations != null ? relations.stream().filter(e -> e.getName().equals(key)).collect(Collectors.toList()) : null;
    }

    @Nullable
    public static List<PLangRelation> findRelations(PsiFile file) {
        var relations = PsiTreeUtil.getChildrenOfType(file, PLangRelation.class);
        return relations != null ? Arrays.asList(relations) : null;
    }
}
