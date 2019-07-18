// Generated from C:/Users/Zylfrox/IdeaProjects/Test\mafe.g4 by ANTLR 4.7.2
package z80;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mafeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VAR=2, VEC=3, SUMA=4, RESTA=5, MULT=6, DIVI=7, AND=8, OR=9, 
		NOT=10, IF=11, ELSE=12, FOR=13, MAYORI=14, MENORQ=15, EQUIVA=16, ASIGNAR=17, 
		LLAVE_ABRE=18, LLAVE_CIERRA=19, PAR_ABRE=20, PAR_CIERRA=21, SEMICOLON=22, 
		ID=23, NUMERO=24, ESPACIOS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAMA", "VAR", "VEC", "SUMA", "RESTA", "MULT", "DIVI", "AND", "OR", 
			"NOT", "IF", "ELSE", "FOR", "MAYORI", "MENORQ", "EQUIVA", "ASIGNAR", 
			"LLAVE_ABRE", "LLAVE_CIERRA", "PAR_ABRE", "PAR_CIERRA", "SEMICOLON", 
			"ID", "NUMERO", "ESPACIOS"
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


	public mafeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mafe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\7\30y\n\30\f\30\16\30|\13\30\3\31\6"+
		"\31\177\n\31\r\31\16\31\u0080\3\32\6\32\u0084\n\32\r\32\16\32\u0085\3"+
		"\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2"+
		"\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u008b\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5>\3\2\2\2\7B\3\2\2\2\tF\3\2\2\2\13"+
		"H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23Q\3\2\2\2\25T\3\2\2\2\27"+
		"V\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#j"+
		"\3\2\2\2%l\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2-t\3\2\2\2/v\3\2\2\2"+
		"\61~\3\2\2\2\63\u0083\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7q\2\289\7"+
		"i\2\29:\7t\2\2:;\7c\2\2;<\7o\2\2<=\7c\2\2=\4\3\2\2\2>?\7x\2\2?@\7c\2\2"+
		"@A\7t\2\2A\6\3\2\2\2BC\7x\2\2CD\7g\2\2DE\7e\2\2E\b\3\2\2\2FG\7-\2\2G\n"+
		"\3\2\2\2HI\7/\2\2I\f\3\2\2\2JK\7,\2\2K\16\3\2\2\2LM\7\61\2\2M\20\3\2\2"+
		"\2NO\7(\2\2OP\7(\2\2P\22\3\2\2\2QR\7~\2\2RS\7~\2\2S\24\3\2\2\2TU\7#\2"+
		"\2U\26\3\2\2\2VW\7k\2\2WX\7h\2\2X\30\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2"+
		"\2\\]\7g\2\2]\32\3\2\2\2^_\7h\2\2_`\7q\2\2`a\7t\2\2a\34\3\2\2\2bc\7@\2"+
		"\2cd\7?\2\2d\36\3\2\2\2ef\7>\2\2f \3\2\2\2gh\7?\2\2hi\7?\2\2i\"\3\2\2"+
		"\2jk\7?\2\2k$\3\2\2\2lm\7}\2\2m&\3\2\2\2no\7\177\2\2o(\3\2\2\2pq\7*\2"+
		"\2q*\3\2\2\2rs\7+\2\2s,\3\2\2\2tu\7=\2\2u.\3\2\2\2vz\t\2\2\2wy\t\3\2\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\60\3\2\2\2|z\3\2\2\2}\177\t"+
		"\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\62\3\2\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\b\32\2\2\u0088\64\3\2\2\2\6\2z\u0080\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}