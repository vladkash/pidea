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

public class PLangConjunctionGoalImpl extends PLangGoalImpl implements PLangConjunctionGoal {

  public PLangConjunctionGoalImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull PLangVisitor visitor) {
    visitor.visitConjunctionGoal(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PLangVisitor) accept((PLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PLangGoal> getGoalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PLangGoal.class);
  }

}
