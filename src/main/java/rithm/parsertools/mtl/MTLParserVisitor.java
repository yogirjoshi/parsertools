// Generated from MTLParser.g4 by ANTLR 4.2

	package rithm.parsertools.mtl;
	import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MTLParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MTLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MTLParserParser#unaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNonTemporal(@NotNull MTLParserParser.UnaryNonTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#unaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTemporal(@NotNull MTLParserParser.UnaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#mtl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMtl(@NotNull MTLParserParser.MtlContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred(@NotNull MTLParserParser.PredContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#binaryTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTemporal(@NotNull MTLParserParser.BinaryTemporalContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(@NotNull MTLParserParser.IntervalContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#intervalNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalNode(@NotNull MTLParserParser.IntervalNodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MTLParserParser#binaryNonTemporal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryNonTemporal(@NotNull MTLParserParser.BinaryNonTemporalContext ctx);
}