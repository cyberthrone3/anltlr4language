// Generated from Vetrix.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VetrixLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VECTOR=1, SUMMED_VECTORS=2, STICK=3, L_BR=4, R_BR=5, L_C_BR=6, R_C_BR=7, 
		NUMBER=8, WS=9, ID=10, COMMA=11, SEMICOLON=12, VECTOR_TYPE=13, PRINT=14, 
		PLUS=15, EQUALS=16, MINUS=17, MULT=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VECTOR", "SUMMED_VECTORS", "STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", 
		"NUMBER", "WS", "ID", "COMMA", "SEMICOLON", "VECTOR_TYPE", "PRINT", "PLUS", 
		"EQUALS", "MINUS", "MULT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'|'", "'['", "']'", "'('", "')'", null, null, null, 
		"','", "';'", "'Vector'", "'print'", "'+'", "'='", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VECTOR", "SUMMED_VECTORS", "STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", 
		"NUMBER", "WS", "ID", "COMMA", "SEMICOLON", "VECTOR_TYPE", "PRINT", "PLUS", 
		"EQUALS", "MINUS", "MULT"
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


	public VetrixLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vetrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\tB\n\t\3\t\6\tE\n\t"+
		"\r\t\16\tF\3\t\3\t\6\tK\n\t\r\t\16\tL\5\tO\n\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\7\13W\n\13\f\13\16\13Z\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5\5\2\13\f\17\17\"\"\5\2C\\"+
		"aac|\6\2\62;C\\aac|y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\62\3\2\2\2\7\66\3\2"+
		"\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21A\3\2\2\2\23P\3\2"+
		"\2\2\25T\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35f\3\2\2\2\37l\3"+
		"\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'+\5\t\5\2()\5\21\t\2)*\5\27\f\2"+
		"*,\3\2\2\2+(\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\5\21"+
		"\t\2\60\61\5\13\6\2\61\4\3\2\2\2\62\63\5\3\2\2\63\64\5\37\20\2\64\65\5"+
		"\3\2\2\65\6\3\2\2\2\66\67\7~\2\2\67\b\3\2\2\289\7]\2\29\n\3\2\2\2:;\7"+
		"_\2\2;\f\3\2\2\2<=\7*\2\2=\16\3\2\2\2>?\7+\2\2?\20\3\2\2\2@B\7/\2\2A@"+
		"\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\4\62;\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2F"+
		"G\3\2\2\2GN\3\2\2\2HJ\7\60\2\2IK\4\62;\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2"+
		"LM\3\2\2\2MO\3\2\2\2NH\3\2\2\2NO\3\2\2\2O\22\3\2\2\2PQ\t\2\2\2QR\3\2\2"+
		"\2RS\b\n\2\2S\24\3\2\2\2TX\t\3\2\2UW\t\4\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y\26\3\2\2\2ZX\3\2\2\2[\\\7.\2\2\\\30\3\2\2\2]^\7=\2\2^"+
		"\32\3\2\2\2_`\7X\2\2`a\7g\2\2ab\7e\2\2bc\7v\2\2cd\7q\2\2de\7t\2\2e\34"+
		"\3\2\2\2fg\7r\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k\36\3\2\2\2lm\7"+
		"-\2\2m \3\2\2\2no\7?\2\2o\"\3\2\2\2pq\7/\2\2q$\3\2\2\2rs\7,\2\2s&\3\2"+
		"\2\2\t\2-AFLNX\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}