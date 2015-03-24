// Generated from ltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.ltl;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ltlgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ltlgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNonTemporal(@NotNull ltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTemporal(@NotNull ltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ltlgrammarParser#ltl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtl(@NotNull ltlgrammarParser.LtlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(@NotNull ltlgrammarParser.PredContext ctx);

	/**
	 * Visit a parse tree produced by {@link ltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTemporal(@NotNull ltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNonTemporal(@NotNull ltlgrammarParser.BinaryNonTemporalContext ctx);
}