// This is a generated file. Not intended for manual editing.
package ru.itmo.pidea.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.itmo.pidea.lang.psi.impl.*;

public interface PLangTypes {

  IElementType ARG = new PLangElementType("ARG");
  IElementType ATOM_GOAL = new PLangElementType("ATOM_GOAL");
  IElementType CONJUNCTION_GOAL = new PLangElementType("CONJUNCTION_GOAL");
  IElementType DISJUNCTION_GOAL = new PLangElementType("DISJUNCTION_GOAL");
  IElementType GOAL = new PLangElementType("GOAL");
  IElementType PAREN_GOAL = new PLangElementType("PAREN_GOAL");
  IElementType RELATION = new PLangElementType("RELATION");
  IElementType RELATION_CALL = new PLangElementType("RELATION_CALL");
  IElementType RELATION_DEF = new PLangElementType("RELATION_DEF");

  IElementType COMMA = new PLangTokenType("COMMA");
  IElementType DOT = new PLangTokenType("DOT");
  IElementType FALSE = new PLangTokenType("FALSE");
  IElementType IDENTIFIER_CALL = new PLangTokenType("IDENTIFIER_CALL");
  IElementType IDENTIFIER_DEF = new PLangTokenType("IDENTIFIER_DEF");
  IElementType LPAREN = new PLangTokenType("LPAREN");
  IElementType QUESTION = new PLangTokenType("QUESTION");
  IElementType RPAREN = new PLangTokenType("RPAREN");
  IElementType SEMICOLON = new PLangTokenType("SEMICOLON");
  IElementType SEPARATOR = new PLangTokenType("SEPARATOR");
  IElementType TRUE = new PLangTokenType("TRUE");
  IElementType VARIABLE = new PLangTokenType("VARIABLE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARG) {
        return new PLangArgImpl(node);
      }
      else if (type == ATOM_GOAL) {
        return new PLangAtomGoalImpl(node);
      }
      else if (type == CONJUNCTION_GOAL) {
        return new PLangConjunctionGoalImpl(node);
      }
      else if (type == DISJUNCTION_GOAL) {
        return new PLangDisjunctionGoalImpl(node);
      }
      else if (type == PAREN_GOAL) {
        return new PLangParenGoalImpl(node);
      }
      else if (type == RELATION) {
        return new PLangRelationImpl(node);
      }
      else if (type == RELATION_CALL) {
        return new PLangRelationCallImpl(node);
      }
      else if (type == RELATION_DEF) {
        return new PLangRelationDefImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
