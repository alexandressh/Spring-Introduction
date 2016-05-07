package edu.fatec.di.database;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
	
	public DatabaseConfig() {
		System.out.println("Criando bean DatabaseConfig");
	}
}
