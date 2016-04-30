package edu.fatec.spring.helloworld;

import org.springframework.beans.factory.annotation.Autowired;


public class CustomBeanFactory {
	
	
	
	public MessageBean factory(){
		MessageBean bean = new MessageBean();
		bean.setId(1);
		bean.setMessage("Created through a factory!");
		
		return bean;
	}
	
	public void init(){
		System.out.println("Initializing bean factory");
	}
	
	public void destroy(){
		System.out.println("Destroying bean factory");
	}
	
	
	@Autowired
	public void test(){
		System.out.println("Test - @Autowired");
	}
	
	
	
	
}