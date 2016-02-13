package com.xinra.restmine.api;

/**
 * <p>Is thrown if a {@link Versioned} object cannot be updated because it was updated by
 * another user since it was loaded.</p>
 * <p>409 Conflict</p>
 * 
 * @author Erik Hofer
 */
public class StaleStateException extends RuntimeException {

	private static final long serialVersionUID = -542728125993375089L;

}
