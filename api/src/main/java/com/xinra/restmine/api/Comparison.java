package com.xinra.restmine.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>Used in filters to determine in which way the given value should be checked against the database.<p>
 * <p>Read the doc of methods that get a {@code Comparison} as a parameter to know which operators 
 * are supported.</p>
 * 
 * @author Erik Hofer
 *
 * @param <T> the type of compared values
 */
public final class Comparison<T> {
	
	public enum Operator {
		ALL,
		NONE,
		EQUAL,
		NOT,
		GRETAER,
		SMALLER,
		BETWEEN
	}
	
	private Operator operator;
	private List<T> operands;	

	/**
	 * <b>Please use static factory methods whenever possible.</b> The constructor does not perform
	 * plausibility checks against the arguments!
	 * 
	 * @param operator
	 * @param operands
	 */
	@SafeVarargs
	public Comparison(Operator operator, T... operands) {
		this.operator = operator;
		this.operands = Collections.unmodifiableList(Arrays.asList(operands));
	}

	public Operator getOperator() {
		return operator;
	}

	/**
	 * @return an <i>unmodifiable</i> List of operands
	 */
	public List<T> getOperands() {
		return operands;
	}
	
	/**
	 * @return a Comparison that matches all possible values
	 */
	public static <T> Comparison<T> all() {
		return new Comparison<T>(Operator.ALL);
	}
	
	/**
	 * @return a Comparison that matches no value at all
	 */
	public static <T> Comparison<T> none() {
		return new Comparison<T>(Operator.NONE);
	}
	
	/**
	 * @param operands one or more values
	 * @return a Comparison that only matches the given value(s)
	 */
	@SafeVarargs
	public static <T> Comparison<T> equal(T... operands) {
		return new Comparison<T>(Operator.EQUAL, operands);
	}
	
	/**
	 * @param operands one or more values
	 * @return a Comparison that matches everything but the given value(s)
	 */
	@SafeVarargs
	public static <T> Comparison<T> not(T... operands) {
		return new Comparison<T>(Operator.NOT, operands);
	}
	
	/**
	 * @param lowerBound
	 * @return a Comparison that matches all values greater than {@code lowerBound}
	 */
	public static <T> Comparison<T> greater(T lowerBound) {
		return new Comparison<T>(Operator.GRETAER, lowerBound);
	}
	
	/**
	 * @param upperBound
	 * @return a Comparison that matches all values smaller than {@code upperBound}
	 */
	public static <T> Comparison<T> smaller(T upperBound) {
		return new Comparison<T>(Operator.SMALLER, upperBound);
	}
	
	/**
	 * @param lowerBound
	 * @param upperBound
	 * @return a Comparison that matches all values between {@code lowerBound} and {@code upperBound} (inclusively)
	 */
	public static <T> Comparison<T> between(T lowerBound, T upperBound) {
		return new Comparison<T>(Operator.BETWEEN, lowerBound, upperBound);
	}
}
