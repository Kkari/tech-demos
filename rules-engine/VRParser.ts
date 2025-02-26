// Generated from VR.g4 by ANTLR 4.13.2
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols

import {
	ATN,
	ATNDeserializer, DecisionState, DFA, FailedPredicateException,
	RecognitionException, NoViableAltException, BailErrorStrategy,
	Parser, ParserATNSimulator,
	RuleContext, ParserRuleContext, PredictionMode, PredictionContextCache,
	TerminalNode, RuleNode,
	Token, TokenStream,
	Interval, IntervalSet
} from 'antlr4';
import VRVisitor from "./VRVisitor.js";

// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;

export default class VRParser extends Parser {
	public static readonly T__0 = 1;
	public static readonly T__1 = 2;
	public static readonly T__2 = 3;
	public static readonly T__3 = 4;
	public static readonly T__4 = 5;
	public static readonly T__5 = 6;
	public static readonly T__6 = 7;
	public static readonly T__7 = 8;
	public static readonly T__8 = 9;
	public static readonly T__9 = 10;
	public static readonly T__10 = 11;
	public static readonly T__11 = 12;
	public static readonly T__12 = 13;
	public static readonly T__13 = 14;
	public static readonly T__14 = 15;
	public static readonly T__15 = 16;
	public static readonly NOT = 17;
	public static readonly COLUMN = 18;
	public static readonly STRING = 19;
	public static readonly INTEGER = 20;
	public static readonly DOUBLE = 21;
	public static readonly BOOLEAN = 22;
	public static readonly WHITESPACE = 23;
	public static override readonly EOF = Token.EOF;
	public static readonly RULE_expression = 0;
	public static readonly literalNames: (string | null)[] = [ null, "'('", 
                                                            "')'", "'IF'", 
                                                            "'THEN'", "'ELSE'", 
                                                            "'LOWER('", 
                                                            "'ISNUMBER('", 
                                                            "'EQUALS_IGNORE_CASE('", 
                                                            "','", "'+'", 
                                                            "'-'", "'IN LIST('", 
                                                            "'='", "'>'", 
                                                            "'AND'", "'OR'", 
                                                            "'NOT'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, null, 
                                                             null, null, 
                                                             null, null, 
                                                             null, null, 
                                                             null, null, 
                                                             null, null, 
                                                             null, null, 
                                                             null, null, 
                                                             null, "NOT", 
                                                             "COLUMN", "STRING", 
                                                             "INTEGER", 
                                                             "DOUBLE", "BOOLEAN", 
                                                             "WHITESPACE" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"expression",
	];
	public get grammarFileName(): string { return "VR.g4"; }
	public get literalNames(): (string | null)[] { return VRParser.literalNames; }
	public get symbolicNames(): (string | null)[] { return VRParser.symbolicNames; }
	public get ruleNames(): string[] { return VRParser.ruleNames; }
	public get serializedATN(): number[] { return VRParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(this, VRParser._ATN, VRParser.DecisionsToDFA, new PredictionContextCache());
	}

	public expression(): ExpressionContext;
	public expression(_p: number): ExpressionContext;
	// @RuleVersion(0)
	public expression(_p?: number): ExpressionContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let localctx: ExpressionContext = new ExpressionContext(this, this._ctx, _parentState);
		let _prevctx: ExpressionContext = localctx;
		let _startState: number = 0;
		this.enterRecursionRule(localctx, 0, VRParser.RULE_expression, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 38;
			this._errHandler.sync(this);
			switch ( this._interp.adaptivePredict(this._input, 2, this._ctx) ) {
			case 1:
				{
				localctx = new ParenExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;

				this.state = 3;
				this.match(VRParser.T__0);
				this.state = 4;
				this.expression(0);
				this.state = 5;
				this.match(VRParser.T__1);
				}
				break;
			case 2:
				{
				localctx = new IfExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 7;
				this.match(VRParser.T__2);
				this.state = 8;
				this.expression(0);
				this.state = 9;
				this.match(VRParser.T__3);
				this.state = 10;
				this.expression(0);
				this.state = 13;
				this._errHandler.sync(this);
				switch ( this._interp.adaptivePredict(this._input, 0, this._ctx) ) {
				case 1:
					{
					this.state = 11;
					this.match(VRParser.T__4);
					this.state = 12;
					this.expression(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				localctx = new LowerExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 15;
				this.match(VRParser.T__5);
				this.state = 16;
				this.match(VRParser.COLUMN);
				this.state = 17;
				this.match(VRParser.T__1);
				}
				break;
			case 4:
				{
				localctx = new IsNumberExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 18;
				this.match(VRParser.T__6);
				this.state = 19;
				this.match(VRParser.COLUMN);
				this.state = 20;
				this.match(VRParser.T__1);
				}
				break;
			case 5:
				{
				localctx = new EqualsIgnoreCaseExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 21;
				this.match(VRParser.T__7);
				{
				this.state = 22;
				this.match(VRParser.COLUMN);
				}
				this.state = 23;
				this.match(VRParser.T__8);
				this.state = 24;
				_la = this._input.LA(1);
				if(!(_la===18 || _la===19)) {
				this._errHandler.recoverInline(this);
				}
				else {
					this._errHandler.reportMatch(this);
				    this.consume();
				}
				this.state = 25;
				this.match(VRParser.T__1);
				}
				break;
			case 6:
				{
				localctx = new InDynExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 26;
				this.match(VRParser.COLUMN);
				this.state = 28;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la===17) {
					{
					this.state = 27;
					this.match(VRParser.NOT);
					}
				}

				this.state = 30;
				this.match(VRParser.T__11);
				this.state = 31;
				this.match(VRParser.STRING);
				this.state = 32;
				this.match(VRParser.T__1);
				}
				break;
			case 7:
				{
				localctx = new IntegerExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 33;
				this.match(VRParser.INTEGER);
				}
				break;
			case 8:
				{
				localctx = new DoubleExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 34;
				this.match(VRParser.DOUBLE);
				}
				break;
			case 9:
				{
				localctx = new StrExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 35;
				this.match(VRParser.STRING);
				}
				break;
			case 10:
				{
				localctx = new ColExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 36;
				this.match(VRParser.COLUMN);
				}
				break;
			case 11:
				{
				localctx = new BoolExpContext(this, localctx);
				this._ctx = localctx;
				_prevctx = localctx;
				this.state = 37;
				this.match(VRParser.BOOLEAN);
				}
				break;
			}
			this._ctx.stop = this._input.LT(-1);
			this.state = 57;
			this._errHandler.sync(this);
			_alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = localctx;
					{
					this.state = 55;
					this._errHandler.sync(this);
					switch ( this._interp.adaptivePredict(this._input, 3, this._ctx) ) {
					case 1:
						{
						localctx = new AddSubExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
						this.pushNewRecursionContext(localctx, _startState, VRParser.RULE_expression);
						this.state = 40;
						if (!(this.precpred(this._ctx, 11))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 11)");
						}
						this.state = 41;
						_la = this._input.LA(1);
						if(!(_la===10 || _la===11)) {
						this._errHandler.recoverInline(this);
						}
						else {
							this._errHandler.reportMatch(this);
						    this.consume();
						}
						this.state = 42;
						this.expression(12);
						}
						break;
					case 2:
						{
						localctx = new EqExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
						this.pushNewRecursionContext(localctx, _startState, VRParser.RULE_expression);
						this.state = 43;
						if (!(this.precpred(this._ctx, 9))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 9)");
						}
						this.state = 44;
						this.match(VRParser.T__12);
						this.state = 45;
						this.expression(10);
						}
						break;
					case 3:
						{
						localctx = new LtExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
						this.pushNewRecursionContext(localctx, _startState, VRParser.RULE_expression);
						this.state = 46;
						if (!(this.precpred(this._ctx, 8))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 8)");
						}
						this.state = 47;
						this.match(VRParser.T__13);
						this.state = 48;
						this.expression(9);
						}
						break;
					case 4:
						{
						localctx = new AndExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
						this.pushNewRecursionContext(localctx, _startState, VRParser.RULE_expression);
						this.state = 49;
						if (!(this.precpred(this._ctx, 7))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 7)");
						}
						this.state = 50;
						this.match(VRParser.T__14);
						this.state = 51;
						this.expression(8);
						}
						break;
					case 5:
						{
						localctx = new OrExpContext(this, new ExpressionContext(this, _parentctx, _parentState));
						this.pushNewRecursionContext(localctx, _startState, VRParser.RULE_expression);
						this.state = 52;
						if (!(this.precpred(this._ctx, 6))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 6)");
						}
						this.state = 53;
						this.match(VRParser.T__15);
						this.state = 54;
						this.expression(7);
						}
						break;
					}
					}
				}
				this.state = 59;
				this._errHandler.sync(this);
				_alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return localctx;
	}

	public sempred(localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 0:
			return this.expression_sempred(localctx as ExpressionContext, predIndex);
		}
		return true;
	}
	private expression_sempred(localctx: ExpressionContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 11);
		case 1:
			return this.precpred(this._ctx, 9);
		case 2:
			return this.precpred(this._ctx, 8);
		case 3:
			return this.precpred(this._ctx, 7);
		case 4:
			return this.precpred(this._ctx, 6);
		}
		return true;
	}

	public static readonly _serializedATN: number[] = [4,1,23,61,2,0,7,0,1,
	0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,3,0,14,8,0,1,0,1,0,1,0,1,0,1,
	0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,3,0,29,8,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
	0,1,0,3,0,39,8,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
	0,1,0,5,0,56,8,0,10,0,12,0,59,9,0,1,0,0,1,0,1,0,0,2,1,0,18,19,1,0,10,11,
	76,0,38,1,0,0,0,2,3,6,0,-1,0,3,4,5,1,0,0,4,5,3,0,0,0,5,6,5,2,0,0,6,39,1,
	0,0,0,7,8,5,3,0,0,8,9,3,0,0,0,9,10,5,4,0,0,10,13,3,0,0,0,11,12,5,5,0,0,
	12,14,3,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,14,39,1,0,0,0,15,16,5,6,0,0,16,
	17,5,18,0,0,17,39,5,2,0,0,18,19,5,7,0,0,19,20,5,18,0,0,20,39,5,2,0,0,21,
	22,5,8,0,0,22,23,5,18,0,0,23,24,5,9,0,0,24,25,7,0,0,0,25,39,5,2,0,0,26,
	28,5,18,0,0,27,29,5,17,0,0,28,27,1,0,0,0,28,29,1,0,0,0,29,30,1,0,0,0,30,
	31,5,12,0,0,31,32,5,19,0,0,32,39,5,2,0,0,33,39,5,20,0,0,34,39,5,21,0,0,
	35,39,5,19,0,0,36,39,5,18,0,0,37,39,5,22,0,0,38,2,1,0,0,0,38,7,1,0,0,0,
	38,15,1,0,0,0,38,18,1,0,0,0,38,21,1,0,0,0,38,26,1,0,0,0,38,33,1,0,0,0,38,
	34,1,0,0,0,38,35,1,0,0,0,38,36,1,0,0,0,38,37,1,0,0,0,39,57,1,0,0,0,40,41,
	10,11,0,0,41,42,7,1,0,0,42,56,3,0,0,12,43,44,10,9,0,0,44,45,5,13,0,0,45,
	56,3,0,0,10,46,47,10,8,0,0,47,48,5,14,0,0,48,56,3,0,0,9,49,50,10,7,0,0,
	50,51,5,15,0,0,51,56,3,0,0,8,52,53,10,6,0,0,53,54,5,16,0,0,54,56,3,0,0,
	7,55,40,1,0,0,0,55,43,1,0,0,0,55,46,1,0,0,0,55,49,1,0,0,0,55,52,1,0,0,0,
	56,59,1,0,0,0,57,55,1,0,0,0,57,58,1,0,0,0,58,1,1,0,0,0,59,57,1,0,0,0,5,
	13,28,38,55,57];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!VRParser.__ATN) {
			VRParser.__ATN = new ATNDeserializer().deserialize(VRParser._serializedATN);
		}

		return VRParser.__ATN;
	}


	static DecisionsToDFA = VRParser._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );

}

export class ExpressionContext extends ParserRuleContext {
	constructor(parser?: VRParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
    public get ruleIndex(): number {
    	return VRParser.RULE_expression;
	}
	public override copyFrom(ctx: ExpressionContext): void {
		super.copyFrom(ctx);
	}
}
export class ColExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLUMN(): TerminalNode {
		return this.getToken(VRParser.COLUMN, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitColExp) {
			return visitor.visitColExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class AndExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitAndExp) {
			return visitor.visitAndExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class InDynExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLUMN(): TerminalNode {
		return this.getToken(VRParser.COLUMN, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(VRParser.STRING, 0);
	}
	public NOT(): TerminalNode {
		return this.getToken(VRParser.NOT, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitInDynExp) {
			return visitor.visitInDynExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class BoolExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public BOOLEAN(): TerminalNode {
		return this.getToken(VRParser.BOOLEAN, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitBoolExp) {
			return visitor.visitBoolExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class OrExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitOrExp) {
			return visitor.visitOrExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class AddSubExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitAddSubExp) {
			return visitor.visitAddSubExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class EqExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitEqExp) {
			return visitor.visitEqExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class LtExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitLtExp) {
			return visitor.visitLtExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class IntegerExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public INTEGER(): TerminalNode {
		return this.getToken(VRParser.INTEGER, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitIntegerExp) {
			return visitor.visitIntegerExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class IfExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression_list(): ExpressionContext[] {
		return this.getTypedRuleContexts(ExpressionContext) as ExpressionContext[];
	}
	public expression(i: number): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, i) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitIfExp) {
			return visitor.visitIfExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class StrExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public STRING(): TerminalNode {
		return this.getToken(VRParser.STRING, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitStrExp) {
			return visitor.visitStrExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParenExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public expression(): ExpressionContext {
		return this.getTypedRuleContext(ExpressionContext, 0) as ExpressionContext;
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitParenExp) {
			return visitor.visitParenExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class EqualsIgnoreCaseExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLUMN_list(): TerminalNode[] {
	    	return this.getTokens(VRParser.COLUMN);
	}
	public COLUMN(i: number): TerminalNode {
		return this.getToken(VRParser.COLUMN, i);
	}
	public STRING(): TerminalNode {
		return this.getToken(VRParser.STRING, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitEqualsIgnoreCaseExp) {
			return visitor.visitEqualsIgnoreCaseExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class LowerExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLUMN(): TerminalNode {
		return this.getToken(VRParser.COLUMN, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitLowerExp) {
			return visitor.visitLowerExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class IsNumberExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public COLUMN(): TerminalNode {
		return this.getToken(VRParser.COLUMN, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitIsNumberExp) {
			return visitor.visitIsNumberExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class DoubleExpContext extends ExpressionContext {
	constructor(parser: VRParser, ctx: ExpressionContext) {
		super(parser, ctx.parentCtx, ctx.invokingState);
		super.copyFrom(ctx);
	}
	public DOUBLE(): TerminalNode {
		return this.getToken(VRParser.DOUBLE, 0);
	}
	// @Override
	public accept<Result>(visitor: VRVisitor<Result>): Result {
		if (visitor.visitDoubleExp) {
			return visitor.visitDoubleExp(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
