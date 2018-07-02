// Generated from WormsProgram.g4 by ANTLR 4.7.1

    package worms.programs.internal.parser.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WormsProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NULL=2, SELF=3, TRUE=4, FALSE=5, SQRT=6, SIN=7, COS=8, NOT=9, 
		GETX=10, GETY=11, GETRADIUS=12, GETDIR=13, GETAP=14, GETMAXAP=15, GETHP=16, 
		SAMETEAM=17, SEARCHOBJ=18, DISTANCE=19, ISWORM=20, ISFOOD=21, ISPROJECTILE=22, 
		TURN=23, MOVE=24, JUMP=25, EAT=26, FIRE=27, DEF=28, IF=29, INVOKE=30, 
		THEN=31, ELSE=32, WHILE=33, REPEAT=34, BREAK=35, PRINT=36, ASSIGN=37, 
		ADD=38, SUB=39, MUL=40, DIV=41, AND=42, OR=43, LT=44, LTE=45, GT=46, GTE=47, 
		EQ=48, NEQ=49, NUMBER=50, FLOAT=51, INTEGER=52, IDENTIFIER=53, LEFT_PAREN=54, 
		RIGHT_PAREN=55, LEFT_BRACE=56, RIGHT_BRACE=57, COLON=58, QUESTION_MARK=59, 
		WHITESPACE=60, SINGLE_COMMENT=61;
	public static final int
		RULE_program = 0, RULE_proceduredef = 1, RULE_statement = 2, RULE_assignmentStatement = 3, 
		RULE_whileStatement = 4, RULE_repeatStatement = 5, RULE_ifStatement = 6, 
		RULE_printStatement = 7, RULE_sequenceStatement = 8, RULE_invokeStatement = 9, 
		RULE_breakStatement = 10, RULE_actionStatement = 11, RULE_expression = 12;
	public static final String[] ruleNames = {
		"program", "proceduredef", "statement", "assignmentStatement", "whileStatement", 
		"repeatStatement", "ifStatement", "printStatement", "sequenceStatement", 
		"invokeStatement", "breakStatement", "actionStatement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'null'", "'self'", "'true'", "'false'", "'sqrt'", "'sin'", 
		"'cos'", "'!'", "'getx'", "'gety'", "'getradius'", "'getdir'", "'getap'", 
		"'getmaxap'", "'gethp'", "'sameteam'", "'searchobj'", "'distance'", "'isworm'", 
		"'isfood'", "'isprojectile'", "'turn'", "'move'", "'jump'", "'eat'", "'fire'", 
		"'def'", "'if'", "'invoke'", "'then'", "'else'", "'while'", "'repeat'", 
		"'break'", "'print'", "':='", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", null, null, null, null, 
		"'('", "')'", "'{'", "'}'", "':'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NULL", "SELF", "TRUE", "FALSE", "SQRT", "SIN", "COS", "NOT", 
		"GETX", "GETY", "GETRADIUS", "GETDIR", "GETAP", "GETMAXAP", "GETHP", "SAMETEAM", 
		"SEARCHOBJ", "DISTANCE", "ISWORM", "ISFOOD", "ISPROJECTILE", "TURN", "MOVE", 
		"JUMP", "EAT", "FIRE", "DEF", "IF", "INVOKE", "THEN", "ELSE", "WHILE", 
		"REPEAT", "BREAK", "PRINT", "ASSIGN", "ADD", "SUB", "MUL", "DIV", "AND", 
		"OR", "LT", "LTE", "GT", "GTE", "EQ", "NEQ", "NUMBER", "FLOAT", "INTEGER", 
		"IDENTIFIER", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", 
		"COLON", "QUESTION_MARK", "WHITESPACE", "SINGLE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WormsProgram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WormsProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProceduredefContext proceduredef;
		public List<ProceduredefContext> procdef = new ArrayList<ProceduredefContext>();
		public StatementContext statement;
		public List<StatementContext> programBody = new ArrayList<StatementContext>();
		public List<ProceduredefContext> proceduredef() {
			return getRuleContexts(ProceduredefContext.class);
		}
		public ProceduredefContext proceduredef(int i) {
			return getRuleContext(ProceduredefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(26);
				((ProgramContext)_localctx).proceduredef = proceduredef();
				((ProgramContext)_localctx).procdef.add(((ProgramContext)_localctx).proceduredef);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TURN) | (1L << MOVE) | (1L << JUMP) | (1L << EAT) | (1L << FIRE) | (1L << IF) | (1L << INVOKE) | (1L << WHILE) | (1L << REPEAT) | (1L << BREAK) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << LEFT_BRACE))) != 0)) {
				{
				{
				setState(32);
				((ProgramContext)_localctx).statement = statement();
				((ProgramContext)_localctx).programBody.add(((ProgramContext)_localctx).statement);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProceduredefContext extends ParserRuleContext {
		public Token procname;
		public StatementContext body;
		public TerminalNode DEF() { return getToken(WormsProgramParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WormsProgramParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WormsProgramParser.COLON, 0); }
		public ProceduredefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceduredef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitProceduredef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceduredefContext proceduredef() throws RecognitionException {
		ProceduredefContext _localctx = new ProceduredefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proceduredef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(DEF);
			setState(39);
			((ProceduredefContext)_localctx).procname = match(IDENTIFIER);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(40);
				match(COLON);
				}
			}

			setState(43);
			((ProceduredefContext)_localctx).body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public SequenceStatementContext sequenceStatement() {
			return getRuleContext(SequenceStatementContext.class,0);
		}
		public InvokeStatementContext invokeStatement() {
			return getRuleContext(InvokeStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ActionStatementContext actionStatement() {
			return getRuleContext(ActionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				assignmentStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				repeatStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				ifStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				printStatement();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				sequenceStatement();
				}
				break;
			case INVOKE:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				invokeStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				breakStatement();
				}
				break;
			case TURN:
			case MOVE:
			case JUMP:
			case EAT:
			case FIRE:
				enterOuterAlt(_localctx, 9);
				{
				setState(53);
				actionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public Token variableName;
		public ExpressionContext value;
		public TerminalNode ASSIGN() { return getToken(WormsProgramParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WormsProgramParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((AssignmentStatementContext)_localctx).variableName = match(IDENTIFIER);
			setState(57);
			match(ASSIGN);
			setState(58);
			((AssignmentStatementContext)_localctx).value = expression(0);
			setState(59);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public StatementContext body;
		public TerminalNode WHILE() { return getToken(WormsProgramParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WormsProgramParser.COLON, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(WHILE);
			setState(62);
			((WhileStatementContext)_localctx).condition = expression(0);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(63);
				match(COLON);
				}
			}

			setState(66);
			((WhileStatementContext)_localctx).body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStatementContext extends ParserRuleContext {
		public ExpressionContext value;
		public StatementContext body;
		public TerminalNode REPEAT() { return getToken(WormsProgramParser.REPEAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WormsProgramParser.COLON, 0); }
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(REPEAT);
			setState(69);
			((RepeatStatementContext)_localctx).value = expression(0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(70);
				match(COLON);
				}
			}

			setState(73);
			((RepeatStatementContext)_localctx).body = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public StatementContext ifbody;
		public StatementContext elsebody;
		public TerminalNode IF() { return getToken(WormsProgramParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(WormsProgramParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(WormsProgramParser.COLON, i);
		}
		public TerminalNode ELSE() { return getToken(WormsProgramParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IF);
			setState(76);
			((IfStatementContext)_localctx).condition = expression(0);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(77);
				match(COLON);
				}
			}

			setState(80);
			((IfStatementContext)_localctx).ifbody = statement();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(81);
				match(ELSE);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(82);
					match(COLON);
					}
				}

				setState(85);
				((IfStatementContext)_localctx).elsebody = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext value;
		public TerminalNode PRINT() { return getToken(WormsProgramParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PRINT);
			setState(89);
			((PrintStatementContext)_localctx).value = expression(0);
			setState(90);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode LEFT_BRACE() { return getToken(WormsProgramParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(WormsProgramParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequenceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitSequenceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceStatementContext sequenceStatement() throws RecognitionException {
		SequenceStatementContext _localctx = new SequenceStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sequenceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LEFT_BRACE);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TURN) | (1L << MOVE) | (1L << JUMP) | (1L << EAT) | (1L << FIRE) | (1L << IF) | (1L << INVOKE) | (1L << WHILE) | (1L << REPEAT) | (1L << BREAK) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << LEFT_BRACE))) != 0)) {
				{
				{
				setState(93);
				((SequenceStatementContext)_localctx).statement = statement();
				((SequenceStatementContext)_localctx).stmts.add(((SequenceStatementContext)_localctx).statement);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeStatementContext extends ParserRuleContext {
		public Token procName;
		public TerminalNode INVOKE() { return getToken(WormsProgramParser.INVOKE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(WormsProgramParser.IDENTIFIER, 0); }
		public InvokeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitInvokeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeStatementContext invokeStatement() throws RecognitionException {
		InvokeStatementContext _localctx = new InvokeStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invokeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(INVOKE);
			setState(102);
			((InvokeStatementContext)_localctx).procName = match(IDENTIFIER);
			setState(103);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(WormsProgramParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(BREAK);
			setState(106);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionStatementContext extends ParserRuleContext {
		public ActionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionStatement; }
	 
		public ActionStatementContext() { }
		public void copyFrom(ActionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoveActionContext extends ActionStatementContext {
		public TerminalNode MOVE() { return getToken(WormsProgramParser.MOVE, 0); }
		public MoveActionContext(ActionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitMoveAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TurnActionContext extends ActionStatementContext {
		public ExpressionContext angle;
		public TerminalNode TURN() { return getToken(WormsProgramParser.TURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TurnActionContext(ActionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitTurnAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EatActionContext extends ActionStatementContext {
		public TerminalNode EAT() { return getToken(WormsProgramParser.EAT, 0); }
		public EatActionContext(ActionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitEatAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FireActionContext extends ActionStatementContext {
		public TerminalNode FIRE() { return getToken(WormsProgramParser.FIRE, 0); }
		public FireActionContext(ActionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitFireAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpActionContext extends ActionStatementContext {
		public TerminalNode JUMP() { return getToken(WormsProgramParser.JUMP, 0); }
		public JumpActionContext(ActionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitJumpAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionStatementContext actionStatement() throws RecognitionException {
		ActionStatementContext _localctx = new ActionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actionStatement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TURN:
				_localctx = new TurnActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(TURN);
				setState(109);
				((TurnActionContext)_localctx).angle = expression(0);
				setState(110);
				match(T__0);
				}
				break;
			case MOVE:
				_localctx = new MoveActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(MOVE);
				setState(113);
				match(T__0);
				}
				break;
			case JUMP:
				_localctx = new JumpActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(JUMP);
				setState(115);
				match(T__0);
				}
				break;
			case EAT:
				_localctx = new EatActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(EAT);
				setState(117);
				match(T__0);
				}
				break;
			case FIRE:
				_localctx = new FireActionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(FIRE);
				setState(119);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DistanceExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode DISTANCE() { return getToken(WormsProgramParser.DISTANCE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DistanceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitDistanceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode COS() { return getToken(WormsProgramParser.COS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(WormsProgramParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(WormsProgramParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CosExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitCosExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetYExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETY() { return getToken(WormsProgramParser.GETY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetYExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetYExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(WormsProgramParser.AND, 0); }
		public TerminalNode OR() { return getToken(WormsProgramParser.OR, 0); }
		public AndOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitAndOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsWormExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode ISWORM() { return getToken(WormsProgramParser.ISWORM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsWormExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitIsWormExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode NOT() { return getToken(WormsProgramParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(WormsProgramParser.LT, 0); }
		public TerminalNode LTE() { return getToken(WormsProgramParser.LTE, 0); }
		public TerminalNode GT() { return getToken(WormsProgramParser.GT, 0); }
		public TerminalNode GTE() { return getToken(WormsProgramParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(WormsProgramParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(WormsProgramParser.NEQ, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext subExpr;
		public TerminalNode LEFT_PAREN() { return getToken(WormsProgramParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(WormsProgramParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetRadiusExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETRADIUS() { return getToken(WormsProgramParser.GETRADIUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetRadiusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetRadiusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueLiteralExpressionContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(WormsProgramParser.TRUE, 0); }
		public TrueLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitTrueLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(WormsProgramParser.NULL, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode SQRT() { return getToken(WormsProgramParser.SQRT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(WormsProgramParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(WormsProgramParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SqrtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitSqrtExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode SIN() { return getToken(WormsProgramParser.SIN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(WormsProgramParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(WormsProgramParser.RIGHT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SinExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitSinExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SameTeamExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode SAMETEAM() { return getToken(WormsProgramParser.SAMETEAM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SameTeamExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitSameTeamExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsProjectileExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode ISPROJECTILE() { return getToken(WormsProgramParser.ISPROJECTILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsProjectileExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitIsProjectileExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsFoodExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode ISFOOD() { return getToken(WormsProgramParser.ISFOOD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsFoodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitIsFoodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionContext extends ExpressionContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(WormsProgramParser.NUMBER, 0); }
		public ConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext thenExpr;
		public ExpressionContext elseExpr;
		public TerminalNode QUESTION_MARK() { return getToken(WormsProgramParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(WormsProgramParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchObjExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode SEARCHOBJ() { return getToken(WormsProgramParser.SEARCHOBJ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchObjExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitSearchObjExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetXExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETX() { return getToken(WormsProgramParser.GETX, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetXExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetXExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadVariableExpressionContext extends ExpressionContext {
		public Token variable;
		public TerminalNode IDENTIFIER() { return getToken(WormsProgramParser.IDENTIFIER, 0); }
		public ReadVariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitReadVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(WormsProgramParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(WormsProgramParser.DIV, 0); }
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetDirectionExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETDIR() { return getToken(WormsProgramParser.GETDIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetDirectionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetDirectionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfExpressionContext extends ExpressionContext {
		public TerminalNode SELF() { return getToken(WormsProgramParser.SELF, 0); }
		public SelfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetHPExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETHP() { return getToken(WormsProgramParser.GETHP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetHPExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetHPExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(WormsProgramParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(WormsProgramParser.SUB, 0); }
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetMaxAPExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETMAXAP() { return getToken(WormsProgramParser.GETMAXAP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetMaxAPExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetMaxAPExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetAPExpressionContext extends ExpressionContext {
		public ExpressionContext expr;
		public TerminalNode GETAP() { return getToken(WormsProgramParser.GETAP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetAPExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitGetAPExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseLiteralExpressionContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(WormsProgramParser.FALSE, 0); }
		public FalseLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WormsProgramVisitor ) return ((WormsProgramVisitor<? extends T>)visitor).visitFalseLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new ReadVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				((ReadVariableExpressionContext)_localctx).variable = match(IDENTIFIER);
				}
				break;
			case NUMBER:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				((ConstantExpressionContext)_localctx).value = match(NUMBER);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(FALSE);
				}
				break;
			case NULL:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(NULL);
				}
				break;
			case SELF:
				{
				_localctx = new SelfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(SELF);
				}
				break;
			case LEFT_PAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LEFT_PAREN);
				setState(130);
				((ParenExpressionContext)_localctx).subExpr = expression(0);
				setState(131);
				match(RIGHT_PAREN);
				}
				break;
			case SQRT:
				{
				_localctx = new SqrtExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(SQRT);
				setState(134);
				match(LEFT_PAREN);
				setState(135);
				((SqrtExpressionContext)_localctx).expr = expression(0);
				setState(136);
				match(RIGHT_PAREN);
				}
				break;
			case SIN:
				{
				_localctx = new SinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(SIN);
				setState(139);
				match(LEFT_PAREN);
				setState(140);
				((SinExpressionContext)_localctx).expr = expression(0);
				setState(141);
				match(RIGHT_PAREN);
				}
				break;
			case COS:
				{
				_localctx = new CosExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(COS);
				setState(144);
				match(LEFT_PAREN);
				setState(145);
				((CosExpressionContext)_localctx).expr = expression(0);
				setState(146);
				match(RIGHT_PAREN);
				}
				break;
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(NOT);
				setState(149);
				((NotExpressionContext)_localctx).expr = expression(15);
				}
				break;
			case GETX:
				{
				_localctx = new GetXExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(GETX);
				setState(151);
				((GetXExpressionContext)_localctx).expr = expression(13);
				}
				break;
			case GETY:
				{
				_localctx = new GetYExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(GETY);
				setState(153);
				((GetYExpressionContext)_localctx).expr = expression(12);
				}
				break;
			case GETRADIUS:
				{
				_localctx = new GetRadiusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(GETRADIUS);
				setState(155);
				((GetRadiusExpressionContext)_localctx).expr = expression(11);
				}
				break;
			case GETDIR:
				{
				_localctx = new GetDirectionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(GETDIR);
				setState(157);
				((GetDirectionExpressionContext)_localctx).expr = expression(10);
				}
				break;
			case GETAP:
				{
				_localctx = new GetAPExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(GETAP);
				setState(159);
				((GetAPExpressionContext)_localctx).expr = expression(9);
				}
				break;
			case GETMAXAP:
				{
				_localctx = new GetMaxAPExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(GETMAXAP);
				setState(161);
				((GetMaxAPExpressionContext)_localctx).expr = expression(8);
				}
				break;
			case GETHP:
				{
				_localctx = new GetHPExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(GETHP);
				setState(163);
				((GetHPExpressionContext)_localctx).expr = expression(7);
				}
				break;
			case SAMETEAM:
				{
				_localctx = new SameTeamExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(SAMETEAM);
				setState(165);
				((SameTeamExpressionContext)_localctx).expr = expression(6);
				}
				break;
			case SEARCHOBJ:
				{
				_localctx = new SearchObjExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(SEARCHOBJ);
				setState(167);
				((SearchObjExpressionContext)_localctx).expr = expression(5);
				}
				break;
			case DISTANCE:
				{
				_localctx = new DistanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(DISTANCE);
				setState(169);
				((DistanceExpressionContext)_localctx).expr = expression(4);
				}
				break;
			case ISWORM:
				{
				_localctx = new IsWormExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(ISWORM);
				setState(171);
				((IsWormExpressionContext)_localctx).expr = expression(3);
				}
				break;
			case ISFOOD:
				{
				_localctx = new IsFoodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(ISFOOD);
				setState(173);
				((IsFoodExpressionContext)_localctx).expr = expression(2);
				}
				break;
			case ISPROJECTILE:
				{
				_localctx = new IsProjectileExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(ISPROJECTILE);
				setState(175);
				((IsProjectileExpressionContext)_localctx).expr = expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(179);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						((MulDivExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(182);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						((AddSubExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparisonExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(185);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						((ComparisonExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new AndOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(188);
						((AndOrExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((AndOrExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(191);
						match(QUESTION_MARK);
						setState(192);
						((ConditionalExpressionContext)_localctx).thenExpr = expression(0);
						setState(193);
						match(COLON);
						setState(194);
						((ConditionalExpressionContext)_localctx).elseExpr = expression(15);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6C\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\5\7J\n\7\3\7\3\7\3\b\3\b\3\b\5\bQ\n\b\3\b\3\b\3\b\5\bV"+
		"\n\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\n\3\n\7\na\n\n\f\n\16\nd\13\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c7\n\16\f\16"+
		"\16\16\u00ca\13\16\3\16\2\3\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6"+
		"\3\2*+\3\2()\3\2.\63\3\2,-\2\u00ef\2\37\3\2\2\2\4(\3\2\2\2\68\3\2\2\2"+
		"\b:\3\2\2\2\n?\3\2\2\2\fF\3\2\2\2\16M\3\2\2\2\20Z\3\2\2\2\22^\3\2\2\2"+
		"\24g\3\2\2\2\26k\3\2\2\2\30z\3\2\2\2\32\u00b2\3\2\2\2\34\36\5\4\3\2\35"+
		"\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2"+
		"\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%"+
		"\3\2\2\2()\7\36\2\2)+\7\67\2\2*,\7<\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2"+
		"-.\5\6\4\2.\5\3\2\2\2/9\5\b\5\2\609\5\n\6\2\619\5\f\7\2\629\5\16\b\2\63"+
		"9\5\20\t\2\649\5\22\n\2\659\5\24\13\2\669\5\26\f\2\679\5\30\r\28/\3\2"+
		"\2\28\60\3\2\2\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3"+
		"\2\2\28\66\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\7\67\2\2;<\7\'\2\2<=\5\32"+
		"\16\2=>\7\3\2\2>\t\3\2\2\2?@\7#\2\2@B\5\32\16\2AC\7<\2\2BA\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DE\5\6\4\2E\13\3\2\2\2FG\7$\2\2GI\5\32\16\2HJ\7<\2\2I"+
		"H\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\6\4\2L\r\3\2\2\2MN\7\37\2\2NP\5\32\16"+
		"\2OQ\7<\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RX\5\6\4\2SU\7\"\2\2TV\7<\2\2"+
		"UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\5\6\4\2XS\3\2\2\2XY\3\2\2\2Y\17\3\2\2"+
		"\2Z[\7&\2\2[\\\5\32\16\2\\]\7\3\2\2]\21\3\2\2\2^b\7:\2\2_a\5\6\4\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7;\2\2f\23"+
		"\3\2\2\2gh\7 \2\2hi\7\67\2\2ij\7\3\2\2j\25\3\2\2\2kl\7%\2\2lm\7\3\2\2"+
		"m\27\3\2\2\2no\7\31\2\2op\5\32\16\2pq\7\3\2\2q{\3\2\2\2rs\7\32\2\2s{\7"+
		"\3\2\2tu\7\33\2\2u{\7\3\2\2vw\7\34\2\2w{\7\3\2\2xy\7\35\2\2y{\7\3\2\2"+
		"zn\3\2\2\2zr\3\2\2\2zt\3\2\2\2zv\3\2\2\2zx\3\2\2\2{\31\3\2\2\2|}\b\16"+
		"\1\2}\u00b3\7\67\2\2~\u00b3\7\64\2\2\177\u00b3\7\6\2\2\u0080\u00b3\7\7"+
		"\2\2\u0081\u00b3\7\4\2\2\u0082\u00b3\7\5\2\2\u0083\u0084\78\2\2\u0084"+
		"\u0085\5\32\16\2\u0085\u0086\79\2\2\u0086\u00b3\3\2\2\2\u0087\u0088\7"+
		"\b\2\2\u0088\u0089\78\2\2\u0089\u008a\5\32\16\2\u008a\u008b\79\2\2\u008b"+
		"\u00b3\3\2\2\2\u008c\u008d\7\t\2\2\u008d\u008e\78\2\2\u008e\u008f\5\32"+
		"\16\2\u008f\u0090\79\2\2\u0090\u00b3\3\2\2\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0093\78\2\2\u0093\u0094\5\32\16\2\u0094\u0095\79\2\2\u0095\u00b3\3\2"+
		"\2\2\u0096\u0097\7\13\2\2\u0097\u00b3\5\32\16\21\u0098\u0099\7\f\2\2\u0099"+
		"\u00b3\5\32\16\17\u009a\u009b\7\r\2\2\u009b\u00b3\5\32\16\16\u009c\u009d"+
		"\7\16\2\2\u009d\u00b3\5\32\16\r\u009e\u009f\7\17\2\2\u009f\u00b3\5\32"+
		"\16\f\u00a0\u00a1\7\20\2\2\u00a1\u00b3\5\32\16\13\u00a2\u00a3\7\21\2\2"+
		"\u00a3\u00b3\5\32\16\n\u00a4\u00a5\7\22\2\2\u00a5\u00b3\5\32\16\t\u00a6"+
		"\u00a7\7\23\2\2\u00a7\u00b3\5\32\16\b\u00a8\u00a9\7\24\2\2\u00a9\u00b3"+
		"\5\32\16\7\u00aa\u00ab\7\25\2\2\u00ab\u00b3\5\32\16\6\u00ac\u00ad\7\26"+
		"\2\2\u00ad\u00b3\5\32\16\5\u00ae\u00af\7\27\2\2\u00af\u00b3\5\32\16\4"+
		"\u00b0\u00b1\7\30\2\2\u00b1\u00b3\5\32\16\3\u00b2|\3\2\2\2\u00b2~\3\2"+
		"\2\2\u00b2\177\3\2\2\2\u00b2\u0080\3\2\2\2\u00b2\u0081\3\2\2\2\u00b2\u0082"+
		"\3\2\2\2\u00b2\u0083\3\2\2\2\u00b2\u0087\3\2\2\2\u00b2\u008c\3\2\2\2\u00b2"+
		"\u0091\3\2\2\2\u00b2\u0096\3\2\2\2\u00b2\u0098\3\2\2\2\u00b2\u009a\3\2"+
		"\2\2\u00b2\u009c\3\2\2\2\u00b2\u009e\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2"+
		"\u00a2\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a8\3\2"+
		"\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00c8\3\2\2\2\u00b4\u00b5\f\30\2\2\u00b5\u00b6\t"+
		"\2\2\2\u00b6\u00c7\5\32\16\31\u00b7\u00b8\f\27\2\2\u00b8\u00b9\t\3\2\2"+
		"\u00b9\u00c7\5\32\16\30\u00ba\u00bb\f\26\2\2\u00bb\u00bc\t\4\2\2\u00bc"+
		"\u00c7\5\32\16\27\u00bd\u00be\f\25\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c7"+
		"\5\32\16\26\u00c0\u00c1\f\20\2\2\u00c1\u00c2\7=\2\2\u00c2\u00c3\5\32\16"+
		"\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\5\32\16\21\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00b4\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bd\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00c8\3\2\2\2\20\37%+8BIPUXbz\u00b2"+
		"\u00c6\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}