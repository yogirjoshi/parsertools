// Generated from foltlgrammar.g4 by ANTLR 4.2

	package rithm.parsertools.foltl;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link foltlgrammarParser}.
 */
public interface foltlgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNonTemporal(@NotNull foltlgrammarParser.UnaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNonTemporal(@NotNull foltlgrammarParser.UnaryNonTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporal(@NotNull foltlgrammarParser.UnaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporal(@NotNull foltlgrammarParser.UnaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(@NotNull foltlgrammarParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(@NotNull foltlgrammarParser.PredContext ctx);

	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTemporal(@NotNull foltlgrammarParser.BinaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTemporal(@NotNull foltlgrammarParser.BinaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#foltl}.
	 * @param ctx the parse tree
	 */
	void enterFoltl(@NotNull foltlgrammarParser.FoltlContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#foltl}.
	 * @param ctx the parse tree
	 */
	void exitFoltl(@NotNull foltlgrammarParser.FoltlContext ctx);

	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#quant}.
	 * @param ctx the parse tree
	 */
	void enterQuant(@NotNull foltlgrammarParser.QuantContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#quant}.
	 * @param ctx the parse tree
	 */
	void exitQuant(@NotNull foltlgrammarParser.QuantContext ctx);

	/**
	 * Enter a parse tree produced by {@link foltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNonTemporal(@NotNull foltlgrammarParser.BinaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link foltlgrammarParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNonTemporal(@NotNull foltlgrammarParser.BinaryNonTemporalContext ctx);
}