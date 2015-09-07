// Generated from ptltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.ptltl;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ptltlgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ptltlgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ptltlgrammarParser#ptltl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtltl(@NotNull ptltlgrammarParser.PtltlContext ctx);

	/**
	 * Visit a parse tree produced by {@link ptltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNonTemporal(@NotNull ptltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ptltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTemporal(@NotNull ptltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ptltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(@NotNull ptltlgrammarParser.PredContext ctx);

	/**
	 * Visit a parse tree produced by {@link ptltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTemporal(@NotNull ptltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ptltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNonTemporal(@NotNull ptltlgrammarParser.BinaryNonTemporalContext ctx);
}