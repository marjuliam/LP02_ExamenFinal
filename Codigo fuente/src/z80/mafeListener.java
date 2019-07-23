// Generated from C:/Users/Zylfrox/IdeaProjects/Test\mafe.g4 by ANTLR 4.7.2
package z80;
    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mafeParser}.
 */
public interface mafeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mafeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mafeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mafeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(mafeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(mafeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(mafeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(mafeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void enterCiclofor(mafeParser.CicloforContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#ciclofor}.
	 * @param ctx the parse tree
	 */
	void exitCiclofor(mafeParser.CicloforContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(mafeParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(mafeParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#sentbooleana}.
	 * @param ctx the parse tree
	 */
	void enterSentbooleana(mafeParser.SentbooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#sentbooleana}.
	 * @param ctx the parse tree
	 */
	void exitSentbooleana(mafeParser.SentbooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#sentboolenanawhile}.
	 * @param ctx the parse tree
	 */
	void enterSentboolenanawhile(mafeParser.SentboolenanawhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#sentboolenanawhile}.
	 * @param ctx the parse tree
	 */
	void exitSentboolenanawhile(mafeParser.SentboolenanawhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#ciclowhile}.
	 * @param ctx the parse tree
	 */
	void enterCiclowhile(mafeParser.CiclowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#ciclowhile}.
	 * @param ctx the parse tree
	 */
	void exitCiclowhile(mafeParser.CiclowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(mafeParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(mafeParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#vec_decl}.
	 * @param ctx the parse tree
	 */
	void enterVec_decl(mafeParser.Vec_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#vec_decl}.
	 * @param ctx the parse tree
	 */
	void exitVec_decl(mafeParser.Vec_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#var_asign_n}.
	 * @param ctx the parse tree
	 */
	void enterVar_asign_n(mafeParser.Var_asign_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#var_asign_n}.
	 * @param ctx the parse tree
	 */
	void exitVar_asign_n(mafeParser.Var_asign_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#var_asign_v}.
	 * @param ctx the parse tree
	 */
	void enterVar_asign_v(mafeParser.Var_asign_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#var_asign_v}.
	 * @param ctx the parse tree
	 */
	void exitVar_asign_v(mafeParser.Var_asign_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(mafeParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(mafeParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(mafeParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(mafeParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(mafeParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(mafeParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mafeParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(mafeParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mafeParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(mafeParser.DivisionContext ctx);
}