package edu.fatec.custom;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomOAM implements OAM{

	@Autowired
	private SomeBean someBean;
	
	@Override
	public void transformRequest() {
		System.out.println(someBean.toString());
	}

	@Override
	public void processRequest() {
		someBean.toString();
	}

	@Override
	public void processResponse() {
		someBean.toString();
	}

	@Override
	public void transformResponse() {
		someBean.toString();
	}

	
}
