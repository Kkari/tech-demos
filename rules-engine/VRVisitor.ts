// Generated from VR.g4 by ANTLR 4.13.2

import { ParseTreeVisitor } from "antlr4";

import { ColExpContext } from "./VRParser.js";
import { AndExpContext } from "./VRParser.js";
import { InDynExpContext } from "./VRParser.js";
import { BoolExpContext } from "./VRParser.js";
import { OrExpContext } from "./VRParser.js";
import { AddSubExpContext } from "./VRParser.js";
import { EqExpContext } from "./VRParser.js";
import { LtExpContext } from "./VRParser.js";
import { IntegerExpContext } from "./VRParser.js";
import { IfExpContext } from "./VRParser.js";
import { StrExpContext } from "./VRParser.js";
import { ParenExpContext } from "./VRParser.js";
import { EqualsIgnoreCaseExpContext } from "./VRParser.js";
import { LowerExpContext } from "./VRParser.js";
import { IsNumberExpContext } from "./VRParser.js";
import { DoubleExpContext } from "./VRParser.js";

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `VRParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export default class VRVisitor<Result> extends ParseTreeVisitor<Result> {
  /**
   * Visit a parse tree produced by the `colExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitColExp?: (ctx: ColExpContext) => Result;
  /**
   * Visit a parse tree produced by the `andExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitAndExp?: (ctx: AndExpContext) => Result;
  /**
   * Visit a parse tree produced by the `inDynExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitInDynExp?: (ctx: InDynExpContext) => Result;
  /**
   * Visit a parse tree produced by the `boolExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitBoolExp?: (ctx: BoolExpContext) => Result;
  /**
   * Visit a parse tree produced by the `orExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitOrExp?: (ctx: OrExpContext) => Result;
  /**
   * Visit a parse tree produced by the `addSubExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitAddSubExp?: (ctx: AddSubExpContext) => Result;
  /**
   * Visit a parse tree produced by the `eqExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitEqExp?: (ctx: EqExpContext) => Result;
  /**
   * Visit a parse tree produced by the `ltExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitLtExp?: (ctx: LtExpContext) => Result;
  /**
   * Visit a parse tree produced by the `integerExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitIntegerExp?: (ctx: IntegerExpContext) => Result;
  /**
   * Visit a parse tree produced by the `ifExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitIfExp?: (ctx: IfExpContext) => Result;
  /**
   * Visit a parse tree produced by the `strExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitStrExp?: (ctx: StrExpContext) => Result;
  /**
   * Visit a parse tree produced by the `parenExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitParenExp?: (ctx: ParenExpContext) => Result;
  /**
   * Visit a parse tree produced by the `equalsIgnoreCaseExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitEqualsIgnoreCaseExp?: (ctx: EqualsIgnoreCaseExpContext) => Result;
  /**
   * Visit a parse tree produced by the `lowerExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitLowerExp?: (ctx: LowerExpContext) => Result;
  /**
   * Visit a parse tree produced by the `isNumberExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitIsNumberExp?: (ctx: IsNumberExpContext) => Result;
  /**
   * Visit a parse tree produced by the `doubleExp`
   * labeled alternative in `VRParser.expression`.
   * @param ctx the parse tree
   * @return the visitor result
   */
  visitDoubleExp?: (ctx: DoubleExpContext) => Result;
}
