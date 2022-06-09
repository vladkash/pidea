// This is a generated file. Not intended for manual editing.
package ru.itmo.pidea.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class PLangVisitor extends PsiElementVisitor {

  public void visitArg(@NotNull PLangArg o) {
    visitPsiElement(o);
  }

  public void visitAtomGoal(@NotNull PLangAtomGoal o) {
    visitGoal(o);
  }

  public void visitConjunctionGoal(@NotNull PLangConjunctionGoal o) {
    visitGoal(o);
  }

  public void visitDisjunctionGoal(@NotNull PLangDisjunctionGoal o) {
    visitGoal(o);
  }

  public void visitGoal(@NotNull PLangGoal o) {
    visitPsiElement(o);
  }

  public void visitParenGoal(@NotNull PLangParenGoal o) {
    visitGoal(o);
  }

  public void visitRelation(@NotNull PLangRelation o) {
    visitPsiElement(o);
  }

  public void visitRelationCall(@NotNull PLangRelationCall o) {
    visitPsiElement(o);
  }

  public void visitRelationDef(@NotNull PLangRelationDef o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
