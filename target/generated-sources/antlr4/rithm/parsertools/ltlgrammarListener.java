// Generated from ltlgrammar.g4 by ANTLR 4.2.2

	package rithm.parsertools;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ltlgrammarParser}.
 */
public interface ltlgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNonTemporal(@NotNull ltlgrammarParser.UnaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNonTemporal(@NotNull ltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporal(@NotNull ltlgrammarParser.UnaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporal(@NotNull ltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ltlgrammarParser#ltl}.
	 * @param ctx the parse tree
	 */
	void enterLtl(@NotNull ltlgrammarParser.LtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlgrammarParser#ltl}.
	 * @param ctx the parse tree
	 */
	void exitLtl(@NotNull ltlgrammarParser.LtlContext ctx);

	/**
	 * Enter a parse tree produced by {@link ltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(@NotNull ltlgrammarParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(@NotNull ltlgrammarParser.PredContext ctx);

	/**
	 * Enter a parse tree produced by {@link ltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTemporal(@NotNull ltlgrammarParser.BinaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTemporal(@NotNull ltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNonTemporal(@NotNull ltlgrammarParser.BinaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNonTemporal(@NotNull ltlgrammarParser.BinaryNonTemporalContext ctx);
}