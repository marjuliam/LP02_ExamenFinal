// Generated from C:/Users/Zylfrox/IdeaProjects/Test\mafe.g4 by ANTLR 4.7.2
package z80;
    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mafeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VAR=2, VEC=3, SUMA=4, RESTA=5, MULT=6, DIVI=7, AND=8, OR=9, 
		NOT=10, IF=11, ELSE=12, FOR=13, MAYORI=14, MENORQ=15, EQUIVA=16, ASIGNAR=17, 
		LLAVE_ABRE=18, LLAVE_CIERRA=19, PAR_ABRE=20, PAR_CIERRA=21, SEMICOLON=22, 
		ID=23, NUMERO=24, ESPACIOS=25;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_expresion = 2, RULE_ciclofor = 3, 
		RULE_ifelse = 4, RULE_sentbooleana = 5, RULE_var_decl = 6, RULE_vec_decl = 7, 
		RULE_var_asign_n = 8, RULE_var_asign_v = 9, RULE_suma = 10, RULE_resta = 11, 
		RULE_multiplicacion = 12, RULE_division = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "expresion", "ciclofor", "ifelse", "sentbooleana", 
			"var_decl", "vec_decl", "var_asign_n", "var_asign_v", "suma", "resta", 
			"multiplicacion", "division"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'var'", "'vec'", "'+'", "'-'", "'*'", "'/'", "'&&'", 
			"'||'", "'!'", "'if'", "'else'", "'for'", "'>='", "'<'", "'=='", "'='", 
			"'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VAR", "VEC", "SUMA", "RESTA", "MULT", "DIVI", "AND", 
			"OR", "NOT", "IF", "ELSE", "FOR", "MAYORI", "MENORQ", "EQUIVA", "ASIGNAR", 
			"LLAVE_ABRE", "LLAVE_CIERRA", "PAR_ABRE", "PAR_CIERRA", "SEMICOLON", 
			"ID", "NUMERO", "ESPACIOS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "mafe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Object> symbolTable = new HashMap<String,Object>();
	    String assembler = "";
	    String subf = "1";
	    int dirvar=32768;
	    int ifcount = 1;

	public mafeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(mafeParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(mafeParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(mafeParser.LLAVE_CIERRA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(28);
			match(PROGRAMA);
			setState(29);
			match(ID);
			setState(30);
			match(LLAVE_ABRE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VEC) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(31);
				sentencia();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(LLAVE_CIERRA);
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

	public static class SentenciaContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Vec_declContext vec_decl() {
			return getRuleContext(Vec_declContext.class,0);
		}
		public Var_asign_nContext var_asign_n() {
			return getRuleContext(Var_asign_nContext.class,0);
		}
		public Var_asign_vContext var_asign_v() {
			return getRuleContext(Var_asign_vContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public CicloforContext ciclofor() {
			return getRuleContext(CicloforContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				vec_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				var_asign_n();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				var_asign_v();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				suma();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				resta();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				multiplicacion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				division();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(47);
				ifelse();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(48);
				ciclofor();
				}
				break;
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

	public static class ExpresionContext extends ParserRuleContext {
		public String value;
		public Token NUMERO;
		public Token ID;
		public TerminalNode NUMERO() { return getToken(mafeParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expresion);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((ExpresionContext)_localctx).NUMERO = match(NUMERO);
				((ExpresionContext)_localctx).value =  (((ExpresionContext)_localctx).NUMERO!=null?((ExpresionContext)_localctx).NUMERO.getText():null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((ExpresionContext)_localctx).ID = match(ID);
				 ((ExpresionContext)_localctx).value =  "(" + (((ExpresionContext)_localctx).ID!=null?((ExpresionContext)_localctx).ID.getText():null) + subf + ")" ;
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

	public static class CicloforContext extends ParserRuleContext {
		public ExpresionContext expresion;
		public TerminalNode FOR() { return getToken(mafeParser.FOR, 0); }
		public TerminalNode PAR_ABRE() { return getToken(mafeParser.PAR_ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(mafeParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(mafeParser.SEMICOLON, i);
		}
		public TerminalNode PAR_CIERRA() { return getToken(mafeParser.PAR_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(mafeParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(mafeParser.LLAVE_CIERRA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CicloforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclofor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterCiclofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitCiclofor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitCiclofor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloforContext ciclofor() throws RecognitionException {
		CicloforContext _localctx = new CicloforContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ciclofor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(FOR);
			setState(58);
			match(PAR_ABRE);
			setState(59);
			((CicloforContext)_localctx).expresion = expresion();

			                String temp1 = ((CicloforContext)_localctx).expresion.value;
			                assembler += "\n loop_init:";
			                assembler += "\n LD H, "+temp1;
			            
			setState(61);
			match(SEMICOLON);
			setState(62);
			((CicloforContext)_localctx).expresion = expresion();

			                assembler += "\n loop_cond:";
			                String temp2 = ((CicloforContext)_localctx).expresion.value;
			                assembler += "\n LD A, "+temp2;
			                assembler += "\n CP H";
			                assembler += "\n JP Z, loop_end";
			            
			setState(64);
			match(SEMICOLON);
			setState(65);
			((CicloforContext)_localctx).expresion = expresion();

			                String temp3 = ((CicloforContext)_localctx).expresion.value;
			            
			setState(67);
			match(PAR_CIERRA);
			setState(68);
			match(LLAVE_ABRE);

			                assembler += "\n loop_body:";
			            
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VEC) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(70);
				sentencia();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			               assembler += "\n loop_next:";
			               assembler += "\n INC H";
			               assembler += "\n JP loop_cond";
			            
			setState(77);
			match(LLAVE_CIERRA);

			               assembler += "\n loop_end:";
			            
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

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mafeParser.IF, 0); }
		public SentbooleanaContext sentbooleana() {
			return getRuleContext(SentbooleanaContext.class,0);
		}
		public List<TerminalNode> LLAVE_ABRE() { return getTokens(mafeParser.LLAVE_ABRE); }
		public TerminalNode LLAVE_ABRE(int i) {
			return getToken(mafeParser.LLAVE_ABRE, i);
		}
		public List<TerminalNode> LLAVE_CIERRA() { return getTokens(mafeParser.LLAVE_CIERRA); }
		public TerminalNode LLAVE_CIERRA(int i) {
			return getToken(mafeParser.LLAVE_CIERRA, i);
		}
		public TerminalNode ELSE() { return getToken(mafeParser.ELSE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IF);

			                int actual = ifcount;
			                ifcount = ifcount+1;
			                assembler += "\n If"+actual+":";
			            
			setState(82);
			sentbooleana(actual);

			                assembler += "\n Then"+actual+":";
			            
			setState(84);
			match(LLAVE_ABRE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VEC) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(85);
				sentencia();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(LLAVE_CIERRA);

			                assembler += "\n jp Endif"+actual;
			            
			setState(93);
			match(ELSE);

			                assembler += "\n Else"+actual+":";
			            
			setState(95);
			match(LLAVE_ABRE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VEC) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(96);
				sentencia();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(LLAVE_CIERRA);

			                assembler += "\n Endif"+actual+":";
			            
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

	public static class SentbooleanaContext extends ParserRuleContext {
		public int actual;
		public ExpresionContext expresion;
		public TerminalNode PAR_ABRE() { return getToken(mafeParser.PAR_ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYORI() { return getToken(mafeParser.MAYORI, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(mafeParser.PAR_CIERRA, 0); }
		public TerminalNode MENORQ() { return getToken(mafeParser.MENORQ, 0); }
		public TerminalNode EQUIVA() { return getToken(mafeParser.EQUIVA, 0); }
		public SentbooleanaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentbooleanaContext(ParserRuleContext parent, int invokingState, int actual) {
			super(parent, invokingState);
			this.actual = actual;
		}
		@Override public int getRuleIndex() { return RULE_sentbooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterSentbooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitSentbooleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitSentbooleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentbooleanaContext sentbooleana(int actual) throws RecognitionException {
		SentbooleanaContext _localctx = new SentbooleanaContext(_ctx, getState(), actual);
		enterRule(_localctx, 10, RULE_sentbooleana);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(PAR_ABRE);
				setState(106);
				((SentbooleanaContext)_localctx).expresion = expresion();
				String temp1 = ((SentbooleanaContext)_localctx).expresion.value;
				setState(108);
				match(MAYORI);
				setState(109);
				((SentbooleanaContext)_localctx).expresion = expresion();
				String temp2 = ((SentbooleanaContext)_localctx).expresion.value;
				setState(111);
				match(PAR_CIERRA);

				                assembler += "\n LD A,"+temp2;
				                assembler += "\n LD B,A";
				                assembler += "\n LD A,"+temp1;
				                assembler += "\n SUB B";
				                assembler += "\n JP C, Else"+_localctx.actual;
				              
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(PAR_ABRE);
				setState(115);
				((SentbooleanaContext)_localctx).expresion = expresion();
				String temp1 = ((SentbooleanaContext)_localctx).expresion.value;
				setState(117);
				match(MENORQ);
				setState(118);
				((SentbooleanaContext)_localctx).expresion = expresion();
				String temp2 = ((SentbooleanaContext)_localctx).expresion.value;
				setState(120);
				match(PAR_CIERRA);

				                assembler += "\n LD A,"+temp2;
				                assembler += "\n LD B,A";
				                assembler += "\n LD A,"+temp1;
				                assembler += "\n SUB B";
				                assembler += "\n JP NC, Else"+actual;
				              
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(PAR_ABRE);
				setState(124);
				((SentbooleanaContext)_localctx).expresion = expresion();
				String temp1 = ((SentbooleanaContext)_localctx).expresion.value;
				setState(126);
				match(EQUIVA);
				setState(127);
				((SentbooleanaContext)_localctx).expresion = expresion();
				String temp2 = ((SentbooleanaContext)_localctx).expresion.value;
				setState(129);
				match(PAR_CIERRA);

				                assembler += "\n LD A,"+temp2;
				                assembler += "\n LD B,A";
				                assembler += "\n LD A,"+temp1;
				                assembler += "\n SUB B";
				                assembler += "\n JP NZ, Else"+actual;
				              
				}
				break;
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

	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode VAR() { return getToken(mafeParser.VAR, 0); }
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(VAR);
			setState(135);
			((Var_declContext)_localctx).ID = match(ID);
			setState(136);
			match(SEMICOLON);

			            String varname = (((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null) + subf;
			            symbolTable.put(varname,dirvar);
			            assembler += "\n ;declaracion de variable ";
			            assembler += "\n "+varname+": equ "+ dirvar;
			            dirvar = dirvar + 2;
			        
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

	public static class Vec_declContext extends ParserRuleContext {
		public Token ID;
		public Token NUMERO;
		public TerminalNode VEC() { return getToken(mafeParser.VEC, 0); }
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(mafeParser.NUMERO, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public Vec_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vec_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterVec_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitVec_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitVec_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vec_declContext vec_decl() throws RecognitionException {
		Vec_declContext _localctx = new Vec_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vec_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(VEC);
			setState(140);
			((Vec_declContext)_localctx).ID = match(ID);
			setState(141);
			((Vec_declContext)_localctx).NUMERO = match(NUMERO);
			setState(142);
			match(SEMICOLON);

			            int tamano = Integer.parseInt((((Vec_declContext)_localctx).NUMERO!=null?((Vec_declContext)_localctx).NUMERO.getText():null));
			            assembler += "\n ;declaracion de vector ";
			            for(int i = 1; i<=tamano ; i++){
			                String varname = (((Vec_declContext)_localctx).ID!=null?((Vec_declContext)_localctx).ID.getText():null) + "_" + i + subf;
			                symbolTable.put(varname,dirvar);
			                assembler += "\n "+varname+": equ "+ dirvar;
			                dirvar = dirvar + 2;
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

	public static class Var_asign_nContext extends ParserRuleContext {
		public Token ID;
		public Token NUMERO;
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(mafeParser.ASIGNAR, 0); }
		public TerminalNode NUMERO() { return getToken(mafeParser.NUMERO, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public Var_asign_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asign_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterVar_asign_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitVar_asign_n(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitVar_asign_n(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_asign_nContext var_asign_n() throws RecognitionException {
		Var_asign_nContext _localctx = new Var_asign_nContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_asign_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((Var_asign_nContext)_localctx).ID = match(ID);
			setState(146);
			match(ASIGNAR);
			setState(147);
			((Var_asign_nContext)_localctx).NUMERO = match(NUMERO);
			setState(148);
			match(SEMICOLON);

			            String varname = (((Var_asign_nContext)_localctx).ID!=null?((Var_asign_nContext)_localctx).ID.getText():null) + subf;
			            assembler += "\n ;asignar valor a variable";
			            assembler += "\n LD " + "A" + "," + (((Var_asign_nContext)_localctx).NUMERO!=null?((Var_asign_nContext)_localctx).NUMERO.getText():null);
			            assembler += "\n LD " + "(" + varname+ ")" + ",A";
			        
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

	public static class Var_asign_vContext extends ParserRuleContext {
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(mafeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mafeParser.ID, i);
		}
		public TerminalNode ASIGNAR() { return getToken(mafeParser.ASIGNAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public Var_asign_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asign_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterVar_asign_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitVar_asign_v(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitVar_asign_v(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_asign_vContext var_asign_v() throws RecognitionException {
		Var_asign_vContext _localctx = new Var_asign_vContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_asign_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((Var_asign_vContext)_localctx).ID = match(ID);
			String temp1 = (((Var_asign_vContext)_localctx).ID!=null?((Var_asign_vContext)_localctx).ID.getText():null) + subf;
			setState(153);
			match(ASIGNAR);
			setState(154);
			((Var_asign_vContext)_localctx).ID = match(ID);
			String temp2 = (((Var_asign_vContext)_localctx).ID!=null?((Var_asign_vContext)_localctx).ID.getText():null) + subf;
			setState(156);
			match(SEMICOLON);

			            assembler += "\n ;asignar variable a otra variable";
			            assembler += "\n LD " + "A" + "," +"("+ temp2 + ")";
			            assembler += "\n LD " + "(" + temp1 + ")" + ",A";
			        
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

	public static class SumaContext extends ParserRuleContext {
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(mafeParser.ASIGNAR, 0); }
		public TerminalNode PAR_ABRE() { return getToken(mafeParser.PAR_ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(mafeParser.SUMA, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(mafeParser.PAR_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((SumaContext)_localctx).ID = match(ID);
			setState(160);
			match(ASIGNAR);
			setState(161);
			match(PAR_ABRE);
			setState(162);
			((SumaContext)_localctx).expresion = expresion();
			String temp1 = ((SumaContext)_localctx).expresion.value;
			setState(164);
			match(SUMA);
			setState(165);
			((SumaContext)_localctx).expresion = expresion();
			 String temp2 = ((SumaContext)_localctx).expresion.value;
			setState(167);
			match(PAR_CIERRA);
			setState(168);
			match(SEMICOLON);

			            assembler += "\n ;sumar "+temp1+"+"+temp2;
			            assembler += "\n LD A," + temp2;
			            assembler += "\n LD B,A";
			            assembler += "\n LD A," + temp1;
			            assembler += "\n ADD A,B";
			            assembler += "\n LD " + "(" + (((SumaContext)_localctx).ID!=null?((SumaContext)_localctx).ID.getText():null) + subf + ")" + ",A";
			        
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

	public static class RestaContext extends ParserRuleContext {
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(mafeParser.ASIGNAR, 0); }
		public TerminalNode PAR_ABRE() { return getToken(mafeParser.PAR_ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(mafeParser.RESTA, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(mafeParser.PAR_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((RestaContext)_localctx).ID = match(ID);
			setState(172);
			match(ASIGNAR);
			setState(173);
			match(PAR_ABRE);
			setState(174);
			((RestaContext)_localctx).expresion = expresion();
			String temp1 = ((RestaContext)_localctx).expresion.value;
			setState(176);
			match(RESTA);
			setState(177);
			((RestaContext)_localctx).expresion = expresion();
			 String temp2 = ((RestaContext)_localctx).expresion.value;
			setState(179);
			match(PAR_CIERRA);
			setState(180);
			match(SEMICOLON);

			            assembler += "\n ;restar "+temp1+"-"+temp2;
			            assembler += "\n LD A," + temp2;
			            assembler += "\n LD B,A";
			            assembler += "\n LD A," + temp1;
			            assembler += "\n SUB B";
			            assembler += "\n LD " + "(" + (((RestaContext)_localctx).ID!=null?((RestaContext)_localctx).ID.getText():null) + subf + ")" + ",A";
			        
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(mafeParser.ASIGNAR, 0); }
		public TerminalNode PAR_ABRE() { return getToken(mafeParser.PAR_ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(mafeParser.MULT, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(mafeParser.PAR_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((MultiplicacionContext)_localctx).ID = match(ID);
			setState(184);
			match(ASIGNAR);
			setState(185);
			match(PAR_ABRE);
			setState(186);
			((MultiplicacionContext)_localctx).expresion = expresion();
			String temp1 = ((MultiplicacionContext)_localctx).expresion.value;
			setState(188);
			match(MULT);
			setState(189);
			((MultiplicacionContext)_localctx).expresion = expresion();
			 String temp2 = ((MultiplicacionContext)_localctx).expresion.value;
			setState(191);
			match(PAR_CIERRA);
			setState(192);
			match(SEMICOLON);

			            assembler += "\n ;multiplicar "+temp1+"*"+temp2;
			            assembler += "\n LD A," + temp2;
			            assembler += "\n LD C,A";
			            assembler += "\n LD A," + temp1;
			            assembler += "\n LD B,A";
			            assembler += "\n LD A,0";
			            assembler += "\n ADD A,C";
			            assembler += "\n DJNZ $-1";
			            assembler += "\n LD " + "(" + (((MultiplicacionContext)_localctx).ID!=null?((MultiplicacionContext)_localctx).ID.getText():null) + subf + ")" + ",A";
			        
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

	public static class DivisionContext extends ParserRuleContext {
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(mafeParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(mafeParser.ASIGNAR, 0); }
		public TerminalNode PAR_ABRE() { return getToken(mafeParser.PAR_ABRE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIVI() { return getToken(mafeParser.DIVI, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(mafeParser.PAR_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(mafeParser.SEMICOLON, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mafeListener ) ((mafeListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mafeVisitor ) return ((mafeVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((DivisionContext)_localctx).ID = match(ID);
			setState(196);
			match(ASIGNAR);
			setState(197);
			match(PAR_ABRE);
			setState(198);
			((DivisionContext)_localctx).expresion = expresion();
			String temp1 = ((DivisionContext)_localctx).expresion.value;
			setState(200);
			match(DIVI);
			setState(201);
			((DivisionContext)_localctx).expresion = expresion();
			 String temp2 = ((DivisionContext)_localctx).expresion.value;
			setState(203);
			match(PAR_CIERRA);
			setState(204);
			match(SEMICOLON);

			            assembler += "\n ;dividir "+temp1+"/"+temp2;
			            assembler += "\n LD A," + temp1;
			            assembler += "\n LD C,A";
			            assembler += "\n LD A," + temp2;
			            assembler += "\n LD D,A";
			            assembler += "\n LD B,8";
			            assembler += "\n XOR A";
			            assembler += "\n SLA C";
			            assembler += "\n RLA";
			            assembler += "\n CP D";
			            assembler += "\n JR C,$+4";
			            assembler += "\n INC C";
			            assembler += "\n SUB D";
			            assembler += "\n DJNZ $-8";
			            assembler += "\n LD E,A";
			            assembler += "\n LD A,C";
			            assembler += "\n LD " + "(" + (((DivisionContext)_localctx).ID!=null?((DivisionContext)_localctx).ID.getText():null) + subf + ")" + ",A";
			        
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3"+
		"\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6d\n\6\f\6\16"+
		"\6g\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0087\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\2\2\u00d3\2\36\3\2\2\2\4\63\3\2\2\2\69\3\2"+
		"\2\2\b;\3\2\2\2\nR\3\2\2\2\f\u0086\3\2\2\2\16\u0088\3\2\2\2\20\u008d\3"+
		"\2\2\2\22\u0093\3\2\2\2\24\u0099\3\2\2\2\26\u00a1\3\2\2\2\30\u00ad\3\2"+
		"\2\2\32\u00b9\3\2\2\2\34\u00c5\3\2\2\2\36\37\7\3\2\2\37 \7\31\2\2 $\7"+
		"\24\2\2!#\5\4\3\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2"+
		"&$\3\2\2\2\'(\7\25\2\2(\3\3\2\2\2)\64\5\16\b\2*\64\5\20\t\2+\64\5\22\n"+
		"\2,\64\5\24\13\2-\64\5\26\f\2.\64\5\30\r\2/\64\5\32\16\2\60\64\5\34\17"+
		"\2\61\64\5\n\6\2\62\64\5\b\5\2\63)\3\2\2\2\63*\3\2\2\2\63+\3\2\2\2\63"+
		",\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2"+
		"\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\7\32\2\2\66:\b\4\1\2\678\7\31\2"+
		"\28:\b\4\1\29\65\3\2\2\29\67\3\2\2\2:\7\3\2\2\2;<\7\17\2\2<=\7\26\2\2"+
		"=>\5\6\4\2>?\b\5\1\2?@\7\30\2\2@A\5\6\4\2AB\b\5\1\2BC\7\30\2\2CD\5\6\4"+
		"\2DE\b\5\1\2EF\7\27\2\2FG\7\24\2\2GK\b\5\1\2HJ\5\4\3\2IH\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b\5\1\2OP\7\25\2\2PQ\b"+
		"\5\1\2Q\t\3\2\2\2RS\7\r\2\2ST\b\6\1\2TU\5\f\7\2UV\b\6\1\2VZ\7\24\2\2W"+
		"Y\5\4\3\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2"+
		"\2]^\7\25\2\2^_\b\6\1\2_`\7\16\2\2`a\b\6\1\2ae\7\24\2\2bd\5\4\3\2cb\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\25\2\2ij"+
		"\b\6\1\2j\13\3\2\2\2kl\7\26\2\2lm\5\6\4\2mn\b\7\1\2no\7\20\2\2op\5\6\4"+
		"\2pq\b\7\1\2qr\7\27\2\2rs\b\7\1\2s\u0087\3\2\2\2tu\7\26\2\2uv\5\6\4\2"+
		"vw\b\7\1\2wx\7\21\2\2xy\5\6\4\2yz\b\7\1\2z{\7\27\2\2{|\b\7\1\2|\u0087"+
		"\3\2\2\2}~\7\26\2\2~\177\5\6\4\2\177\u0080\b\7\1\2\u0080\u0081\7\22\2"+
		"\2\u0081\u0082\5\6\4\2\u0082\u0083\b\7\1\2\u0083\u0084\7\27\2\2\u0084"+
		"\u0085\b\7\1\2\u0085\u0087\3\2\2\2\u0086k\3\2\2\2\u0086t\3\2\2\2\u0086"+
		"}\3\2\2\2\u0087\r\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u008a\7\31\2\2\u008a"+
		"\u008b\7\30\2\2\u008b\u008c\b\b\1\2\u008c\17\3\2\2\2\u008d\u008e\7\5\2"+
		"\2\u008e\u008f\7\31\2\2\u008f\u0090\7\32\2\2\u0090\u0091\7\30\2\2\u0091"+
		"\u0092\b\t\1\2\u0092\21\3\2\2\2\u0093\u0094\7\31\2\2\u0094\u0095\7\23"+
		"\2\2\u0095\u0096\7\32\2\2\u0096\u0097\7\30\2\2\u0097\u0098\b\n\1\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\7\31\2\2\u009a\u009b\b\13\1\2\u009b\u009c\7\23"+
		"\2\2\u009c\u009d\7\31\2\2\u009d\u009e\b\13\1\2\u009e\u009f\7\30\2\2\u009f"+
		"\u00a0\b\13\1\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\7\23"+
		"\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\6\4\2\u00a5\u00a6\b\f\1\2\u00a6"+
		"\u00a7\7\6\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00a9\b\f\1\2\u00a9\u00aa\7\27"+
		"\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\b\f\1\2\u00ac\27\3\2\2\2\u00ad\u00ae"+
		"\7\31\2\2\u00ae\u00af\7\23\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5\6\4"+
		"\2\u00b1\u00b2\b\r\1\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5"+
		"\b\r\1\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\b\r\1\2"+
		"\u00b8\31\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc"+
		"\7\26\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\b\16\1\2\u00be\u00bf\7\b\2\2"+
		"\u00bf\u00c0\5\6\4\2\u00c0\u00c1\b\16\1\2\u00c1\u00c2\7\27\2\2\u00c2\u00c3"+
		"\7\30\2\2\u00c3\u00c4\b\16\1\2\u00c4\33\3\2\2\2\u00c5\u00c6\7\31\2\2\u00c6"+
		"\u00c7\7\23\2\2\u00c7\u00c8\7\26\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\b"+
		"\17\1\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\b\17\1\2\u00cd"+
		"\u00ce\7\27\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\b\17\1\2\u00d0\35\3\2"+
		"\2\2\t$\639KZe\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}