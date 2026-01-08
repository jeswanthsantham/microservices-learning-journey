package com.callerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestClient;

public class CallerServiceRestClientImpl implements ICallerService{
	
	@Autowired
	private RestClient restClient;

	@Override
	public String printUserDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String welcomeUserDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> showBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
