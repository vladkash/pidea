// This is a generated file. Not intended for manual editing.
package ru.itmo.pidea.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.itmo.pidea.lang.psi.PLangTypes.*;
import ru.itmo.pidea.lang.psi.*;

public class PLangAtomGoalImpl extends PLangGoalImpl implements PLangAtomGoal {

  public PLangAtomGoalImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull PLangVisitor visitor) {
    visitor.visitAtomGoal(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PLangVisitor) accept((PLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PLangAtomGoal getAtomGoal() {
    return findChildByClass(PLangAtomGoal.class);
  }

  @Override
  @Nullable
  public PLangRelationCall getRelationCall() {
    return findChildByClass(PLangRelationCall.class);
  }

}
