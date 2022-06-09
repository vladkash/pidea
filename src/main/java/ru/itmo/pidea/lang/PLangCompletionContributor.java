package ru.itmo.pidea.lang;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import ru.itmo.pidea.lang.psi.PLangTypes;

public class PLangCompletionContributor extends CompletionContributor {

    public PLangCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(PLangTypes.IDENTIFIER_CALL),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("true"));
                        resultSet.addElement(LookupElementBuilder.create("false"));
                    }
                }
        );
    }

}
