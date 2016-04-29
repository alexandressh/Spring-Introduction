package edu.fatec.spring.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;

@Configuration
@ComponentScan(value = "edu.fatec.spring.example2")
public class SpringAppExampleAnnotation {


	@Bean
	public MessageBean myFirstBean () {
		return new MessageBean();
	} 


	public static void main(String ... args){

		ApplicationContext context = new AnnotationConfigApplicationContext();
	}


} 