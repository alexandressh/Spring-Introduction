package edu.fatec.di;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMovieFinder implements MovieFinder{

	
	private final List<Movie> movies = new ArrayList<>();
	
	public InMemoryMovieFinder () {
		movies.add(new Movie(1L, "Batman vs Superman", 200L));
		
		System.out.println("Creating InMemoryMovieFinder");
	} 
	
	@Override
	public List<Movie> findAll() {
		return movies;
	}

	

}
