package com.xinra.restmine.api;

/**
 * Represents a GET request to the Redmine REST API. If a GET request doesn't require additional
 * configuration it doens't use a Request object but declares a simple method on {@link Restmine}.
 * 
 * @author Erik Hofer
 *
 * @param <T> the response type of this request
 */
public interface Request<T extends Resource> {

	public Restmine getRestmineRef();

	/**
	 * Sets a reference to a {@link Restmine} object with which the request is associated.
	 * 
	 * @param restmineRef
	 */
	public void setRestmineRef(Restmine restmineRef);
	
	/**
	 * Executes this request against a Redmine REST API
	 * 
	 * @implSpec The default implementation delegates to {@link Restmine#excecute(Request)} of
	 * the associated restmine reference (see {@link #setRestmineRef(Restmine)})
	 * 
	 * @return the response
	 */
	public default T execute() throws AuthorizationException, CommunicationException {
		return getRestmineRef().excecute(this);
	}
}
