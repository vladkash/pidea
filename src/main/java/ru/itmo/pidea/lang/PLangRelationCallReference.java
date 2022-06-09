package ru.itmo.pidea.lang;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.itmo.pidea.lang.psi.PLangRelation;

import java.util.ArrayList;
import java.util.List;

public class PLangRelationCallReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    public PLangRelationCallReference(@NotNull PsiElement element) {
        super(element, TextRange.allOf(element.getFirstChild().getText()));
        key = element.getFirstChild().getText();
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        final List<PLangRelation> relations = PLangUtil.findRelations(myElement.getContainingFile(), key);
        List<ResolveResult> results = new ArrayList<>();
        if (relations != null) {
            for (var relation : relations) {
                results.add(new PsiElementResolveResult(relation));
            }
        }
        return results.toArray(new ResolveResult[0]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }



    @Override
    public Object @NotNull [] getVariants() {
        var relations = PLangUtil.findRelations(myElement.getContainingFile());
        List<LookupElement> variants = new ArrayList<>();
        if (relations != null) {
            for (final var relation : relations) {
                if (relation.getName() != null && relation.getName().length() > 0) {
                    variants.add(LookupElementBuilder
                            .create(relation.getName())
                    );
                }
            }
        }
        return variants.toArray();
    }
}
