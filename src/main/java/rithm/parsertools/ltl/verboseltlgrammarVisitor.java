// Generated from verboseltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.ltl;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link verboseltlgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface verboseltlgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link verboseltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNonTemporal(@NotNull verboseltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link verboseltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTemporal(@NotNull verboseltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link verboseltlgrammarParser#ltl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtl(@NotNull verboseltlgrammarParser.LtlContext ctx);

	/**
	 * Visit a parse tree produced by {@link verboseltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(@NotNull verboseltlgrammarParser.PredContext ctx);

	/**
	 * Visit a parse tree produced by {@link verboseltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTemporal(@NotNull verboseltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link verboseltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNonTemporal(@NotNull verboseltlgrammarParser.BinaryNonTemporalContext ctx);
}