package com.xinra.restime.springimpl;

import com.xinra.restmine.api.AuthorizationException;
import com.xinra.restmine.api.CommunicationException;
import com.xinra.restmine.api.Request;
import com.xinra.restmine.api.Resource;
import com.xinra.restmine.api.Restmine;

public class RestmineImpl implements Restmine {

	@Override
	public <T extends Resource> T excecute(Request<T> request) throws AuthorizationException, CommunicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRedmineUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRedmineUrl(String redmineUrl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getApiKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApiKey(String apiKey) {
		// TODO Auto-generated method stub
		
	}

}
