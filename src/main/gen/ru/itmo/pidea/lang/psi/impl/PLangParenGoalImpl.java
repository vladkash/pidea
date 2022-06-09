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

public class PLangParenGoalImpl extends PLangGoalImpl implements PLangParenGoal {

  public PLangParenGoalImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull PLangVisitor visitor) {
    visitor.visitParenGoal(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PLangVisitor) accept((PLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PLangGoal getGoal() {
    return findChildByClass(PLangGoal.class);
  }

}
