// This is a generated file. Not intended for manual editing.
package ru.itmo.pidea.lang.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.itmo.pidea.lang.psi.PLangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PLangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return pLangFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ATOM_GOAL, CONJUNCTION_GOAL, DISJUNCTION_GOAL, GOAL,
      PAREN_GOAL),
  };

  /* ********************************************************** */
  // VARIABLE | atom_goal
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = consumeToken(b, VARIABLE);
    if (!r) r = atom_goal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // relation* QUESTION goal DOT
  static boolean pLangFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pLangFile")) return false;
    if (!nextTokenIs(b, "", IDENTIFIER_DEF, QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pLangFile_0(b, l + 1);
    r = r && consumeToken(b, QUESTION);
    r = r && goal(b, l + 1, -1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation*
  private static boolean pLangFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pLangFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pLangFile_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // relation_def [ SEPARATOR goal ] DOT
  public static boolean relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation")) return false;
    if (!nextTokenIs(b, IDENTIFIER_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_def(b, l + 1);
    r = r && relation_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, RELATION, r);
    return r;
  }

  // [ SEPARATOR goal ]
  private static boolean relation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1")) return false;
    relation_1_0(b, l + 1);
    return true;
  }

  // SEPARATOR goal
  private static boolean relation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEPARATOR);
    r = r && goal(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER_CALL arg*
  public static boolean relation_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_call")) return false;
    if (!nextTokenIs(b, IDENTIFIER_CALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_CALL);
    r = r && relation_call_1(b, l + 1);
    exit_section_(b, m, RELATION_CALL, r);
    return r;
  }

  // arg*
  private static boolean relation_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relation_call_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER_DEF arg*
  public static boolean relation_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_def")) return false;
    if (!nextTokenIs(b, IDENTIFIER_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_DEF);
    r = r && relation_def_1(b, l + 1);
    exit_section_(b, m, RELATION_DEF, r);
    return r;
  }

  // arg*
  private static boolean relation_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_def_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relation_def_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: goal
  // Operator priority table:
  // 0: BINARY(disjunction_goal)
  // 1: BINARY(conjunction_goal)
  // 2: ATOM(atom_goal) PREFIX(paren_goal)
  public static boolean goal(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "goal")) return false;
    addVariant(b, "<goal>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<goal>");
    r = atom_goal(b, l + 1);
    if (!r) r = paren_goal(b, l + 1);
    p = r;
    r = r && goal_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean goal_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "goal_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, SEMICOLON)) {
        r = goal(b, l, -1);
        exit_section_(b, l, m, DISJUNCTION_GOAL, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, COMMA)) {
        r = goal(b, l, 0);
        exit_section_(b, l, m, CONJUNCTION_GOAL, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // TRUE | FALSE | relation_call | LPAREN atom_goal RPAREN
  public static boolean atom_goal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_goal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM_GOAL, "<atom goal>");
    r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    if (!r) r = relation_call(b, l + 1);
    if (!r) r = atom_goal_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN atom_goal RPAREN
  private static boolean atom_goal_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_goal_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LPAREN);
    r = r && atom_goal(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean paren_goal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_goal")) return false;
    if (!nextTokenIsSmart(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LPAREN);
    p = r;
    r = p && goal(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    exit_section_(b, l, m, PAREN_GOAL, r, p, null);
    return r || p;
  }

}
