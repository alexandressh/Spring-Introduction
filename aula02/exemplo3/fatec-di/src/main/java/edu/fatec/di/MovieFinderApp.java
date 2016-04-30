package edu.fatec.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieFinderApp {

	
	
	public static void main(String [] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Movie movie =  ctx.getBean("myBean", Movie.class);
		System.out.println(movie.getName());
		Movie movie2 =  ctx.getBean("myBean2", Movie.class);
	}
}
