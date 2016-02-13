package com.xinra.restmine.api;

/**
 * Requests to collection resources that are exposed with pagination (see 
 * <a href="http://www.redmine.org/projects/redmine/wiki/Rest_api#Collection-resources-and-pagination">
 * Redmine docs</a>)
 * 
 * @author Erik Hofer
 *
 * @param <T> the response type of this request
 */
public interface PagedRequest<T extends Resource> extends Request<T> {
	
	public int getOffset();
	
	public void setOffset(int offset);
	
	public int getLimit();
	
	public void setLimit();
	
}

