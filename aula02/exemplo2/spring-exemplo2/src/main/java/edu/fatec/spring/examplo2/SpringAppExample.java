package edu.fatec.spring.example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class SpringAppExample {



	public static void main(String ... args){

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
	}


} 