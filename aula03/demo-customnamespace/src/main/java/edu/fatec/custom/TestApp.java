package edu.fatec.custom;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	
	
	
	public static void main(String [] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		OAM o = ctx.getBean(OAM.class);
		o.processRequest();
		((ClassPathXmlApplicationContext)ctx).close();
		
		
	}
	
}