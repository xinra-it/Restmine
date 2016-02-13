package com.xinra.restmine.api;

/**
 * Main interface through which you can access all of Restmine's functionality. It provides methods for
 * all types of requests to the Redmine REST API as well as factory methods for other types defined
 * by this API.
 * 
 * @author Erik Hofer
 */
public interface Restmine {
	
	/**
	 * Executes a GET request against a Redmine REST API
	 * 
	 * @param request
	 * @return the response of the request
	 */
	public <T extends Resource> T excecute(Request<T> request) throws AuthorizationException, CommunicationException;
	
	public String getRedmineUrl();
	
	/**
	 * <p>Sets the URL of a Redmine server the REST API of which you want to access.
	 * This is required to execute any request.</p>
	 * <p>The URL <b>must not</b> contain a trailing slash!</p>
	 * 
	 * @param redmineUrl
	 */
	public void setRedmineUrl(String redmineUrl);
	
	public String getApiKey();
	
	/**
	 * <p>Sets the API key used to access the Redmine REST API. If set to {@code null} (default) no 
	 * API key will be used (anonymous access).<p>
	 * <p>The API key can be found at {@code <Redmine URL>/my/account}</p>
	 * 
	 * @param apiKey
	 */
	public void setApiKey(String apiKey);

}
