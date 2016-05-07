package edu.fatec.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.fatec.di.services.MovieService;

@Configuration
@ComponentScan(basePackages = {
			"edu.fatec.di.configuration",
			"edu.fatec.di.services"
		})
public class MovieFinderApp {
	
	public static void main(String [] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MovieFinderApp.class);
		MovieService movieService = ctx.getBean(MovieService.class);
		movieService.findMovies().forEach(System.out::println);
		((AnnotationConfigApplicationContext)ctx).close();
		
	}
}