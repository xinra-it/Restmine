package com.xinra.restmine.api;

/**
 * Resources that have a version. The version of an update request has to match the
 * resource's version on the Redmine server.
 * 
 * @author Erik Hofer
 *
 * @see StaleStateException
 */
public interface Versioned {
	
	public int getVersion();
	
	public void setVersion();
	
}
