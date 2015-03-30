// Generated from verboseltlgrammar.g4 by ANTLR 4.2.2

	package rithm.parsertools;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link verboseltlgrammarParser}.
 */
public interface verboseltlgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link verboseltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNonTemporal(@NotNull verboseltlgrammarParser.UnaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link verboseltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNonTemporal(@NotNull verboseltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link verboseltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporal(@NotNull verboseltlgrammarParser.UnaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link verboseltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporal(@NotNull verboseltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link verboseltlgrammarParser#ltl}.
	 * @param ctx the parse tree
	 */
	void enterLtl(@NotNull verboseltlgrammarParser.LtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link verboseltlgrammarParser#ltl}.
	 * @param ctx the parse tree
	 */
	void exitLtl(@NotNull verboseltlgrammarParser.LtlContext ctx);

	/**
	 * Enter a parse tree produced by {@link verboseltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(@NotNull verboseltlgrammarParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link verboseltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(@NotNull verboseltlgrammarParser.PredContext ctx);

	/**
	 * Enter a parse tree produced by {@link verboseltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTemporal(@NotNull verboseltlgrammarParser.BinaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link verboseltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTemporal(@NotNull verboseltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link verboseltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNonTemporal(@NotNull verboseltlgrammarParser.BinaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link verboseltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNonTemporal(@NotNull verboseltlgrammarParser.BinaryNonTemporalContext ctx);
}