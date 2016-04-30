package edu.fatec.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieFinderApp {

	
	
	public static void main(String [] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Movie movie =  ctx.getBean("myFirstBean", Movie.class);
		System.out.println(movie);
		Movie movie2 =  ctx.getBean("myBean2", Movie.class);
		System.out.println(movie2);
		Movie movie3 =  ctx.getBean("myBean3", Movie.class);
		System.out.println(movie3);
		
		MovieFinder finder = ctx.getBean(MovieFinder.class);
		
		System.out.println("Imprimindo filmes do arquivo csv: ");
		
		finder
			.findAll()
			.stream()
			.forEach(w -> System.out.println(w));
		
		((ClassPathXmlApplicationContext)ctx).close();
		
	}
}
