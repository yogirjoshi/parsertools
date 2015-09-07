// Generated from foltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.foltl;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link foltlgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface foltlgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNonTemporal(@NotNull foltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTemporal(@NotNull foltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(@NotNull foltlgrammarParser.PredContext ctx);

	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTemporal(@NotNull foltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#foltl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoltl(@NotNull foltlgrammarParser.FoltlContext ctx);

	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#quant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant(@NotNull foltlgrammarParser.QuantContext ctx);

	/**
	 * Visit a parse tree produced by {@link foltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNonTemporal(@NotNull foltlgrammarParser.BinaryNonTemporalContext ctx);
}