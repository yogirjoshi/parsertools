// Generated from ptltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.ptltl;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ptltlgrammarParser}.
 */
public interface ptltlgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ptltlgrammarParser#ptltl}.
	 * @param ctx the parse tree
	 */
	void enterPtltl(@NotNull ptltlgrammarParser.PtltlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ptltlgrammarParser#ptltl}.
	 * @param ctx the parse tree
	 */
	void exitPtltl(@NotNull ptltlgrammarParser.PtltlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ptltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNonTemporal(@NotNull ptltlgrammarParser.UnaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ptltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNonTemporal(@NotNull ptltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ptltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporal(@NotNull ptltlgrammarParser.UnaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ptltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporal(@NotNull ptltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ptltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(@NotNull ptltlgrammarParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link ptltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(@NotNull ptltlgrammarParser.PredContext ctx);

	/**
	 * Enter a parse tree produced by {@link ptltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTemporal(@NotNull ptltlgrammarParser.BinaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ptltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTemporal(@NotNull ptltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ptltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNonTemporal(@NotNull ptltlgrammarParser.BinaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ptltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNonTemporal(@NotNull ptltlgrammarParser.BinaryNonTemporalContext ctx);
}