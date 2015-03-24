// Generated from MTLParser.g4 by ANTLR 4.2.2

	package rithm.parsertools.mtlparser;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MTLParserParser}.
 */
public interface MTLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MTLParserParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNonTemporal(@NotNull MTLParserParser.UnaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNonTemporal(@NotNull MTLParserParser.UnaryNonTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporal(@NotNull MTLParserParser.UnaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#unaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporal(@NotNull MTLParserParser.UnaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#mtl}.
	 * @param ctx the parse tree
	 */
	void enterMtl(@NotNull MTLParserParser.MtlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#mtl}.
	 * @param ctx the parse tree
	 */
	void exitMtl(@NotNull MTLParserParser.MtlContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(@NotNull MTLParserParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(@NotNull MTLParserParser.PredContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTemporal(@NotNull MTLParserParser.BinaryTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#binaryTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTemporal(@NotNull MTLParserParser.BinaryTemporalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull MTLParserParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull MTLParserParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#intervalNode}.
	 * @param ctx the parse tree
	 */
	void enterIntervalNode(@NotNull MTLParserParser.IntervalNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#intervalNode}.
	 * @param ctx the parse tree
	 */
	void exitIntervalNode(@NotNull MTLParserParser.IntervalNodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MTLParserParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryNonTemporal(@NotNull MTLParserParser.BinaryNonTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MTLParserParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryNonTemporal(@NotNull MTLParserParser.BinaryNonTemporalContext ctx);
}