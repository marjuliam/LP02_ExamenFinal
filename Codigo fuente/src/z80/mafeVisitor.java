// Generated from C:/Users/Zylfrox/IdeaProjects/Test\mafe.g4 by ANTLR 4.7.2
package z80;
    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mafeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mafeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mafeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(mafeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(mafeParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(mafeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#ciclofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclofor(mafeParser.CicloforContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(mafeParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#sentbooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentbooleana(mafeParser.SentbooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#sentboolenanawhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentboolenanawhile(mafeParser.SentboolenanawhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#ciclowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclowhile(mafeParser.CiclowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(mafeParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#vec_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVec_decl(mafeParser.Vec_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#var_asign_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_asign_n(mafeParser.Var_asign_nContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#var_asign_v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_asign_v(mafeParser.Var_asign_vContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(mafeParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(mafeParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(mafeParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mafeParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(mafeParser.DivisionContext ctx);
}