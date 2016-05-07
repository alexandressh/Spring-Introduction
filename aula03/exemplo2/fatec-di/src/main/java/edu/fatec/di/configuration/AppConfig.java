package edu.fatec.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import edu.fatec.di.DatabaseMovieFinder;
import edu.fatec.di.MovieFinder;
import edu.fatec.di.database.DatabaseConfig;

@Configuration
@ImportResource("context.xml")
@Import(DatabaseConfig.class)
public class AppConfig {
	
	public AppConfig() {
		System.out.println("Creating AppConfig");
	}
	
	@Bean(name="movieFinder3")
	public MovieFinder getDbMovieFinder() {
		return new DatabaseMovieFinder();
	}
}
