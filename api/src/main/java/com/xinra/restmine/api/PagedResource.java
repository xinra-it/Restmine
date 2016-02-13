package com.xinra.restmine.api;

/**
 * Collection resources that are exposed with pagination (see 
 * <a href="http://www.redmine.org/projects/redmine/wiki/Rest_api#Collection-resources-and-pagination">
 * Redmine docs</a>)
 * 
 * @author Erik Hofer
 */
public interface PagedResource extends Resource {

	public int getTotalCount();
	
	public void setTotalCount(int totalCount);
	
	public int getOffset();
	
	public void setOffset(int offset);
	
	public int getLimit();
	
	public void setLimit();
	
}