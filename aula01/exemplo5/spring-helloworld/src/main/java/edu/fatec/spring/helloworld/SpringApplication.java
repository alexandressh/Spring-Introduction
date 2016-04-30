package edu.fatec.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {


	public static void main(String ... args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
	}



}