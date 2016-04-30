package edu.fatec.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

public class InMemoryMovieFinder implements MovieFinder, 
InitializingBean{

	
	private static final List<Movie> movies = new ArrayList<>();
	
	public InMemoryMovieFinder () {
		movies.add(new Movie(1L, "Batman vs Superman", 200L));
	} 
	
	@Override
	public List<Movie> findAll() {
		return movies;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}
	
	public void init(){
		System.out.println("Executando init()");
	}
	public void destroy(){
		System.out.println("Destruindo bean!");
	}

}
