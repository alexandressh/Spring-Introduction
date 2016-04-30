package edu.fatec.spring.helloworld;

import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean{

	private String message;



	public MessageBean(String message) {
		this.message = message;
	} 


	public String getMessage(){
		return this.message;
	}

	@Override
	public void afterPropertiesSet(){
		System.out.println("Creating bean with message content: " + getMessage());
	}



} 