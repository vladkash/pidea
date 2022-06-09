// This is a generated file. Not intended for manual editing.
package ru.itmo.pidea.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.itmo.pidea.lang.psi.PLangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.itmo.pidea.lang.psi.*;
import com.intellij.psi.PsiReference;

public class PLangRelationCallImpl extends ASTWrapperPsiElement implements PLangRelationCall {

  public PLangRelationCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PLangVisitor visitor) {
    visitor.visitRelationCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PLangVisitor) accept((PLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PLangArg> getArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PLangArg.class);
  }

  @Override
  public PsiReference getReference() {
    return PLangPsiImplUtil.getReference(this);
  }

}
