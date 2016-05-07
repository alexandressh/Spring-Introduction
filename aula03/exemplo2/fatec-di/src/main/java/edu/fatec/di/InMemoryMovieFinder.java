package edu.fatec.di;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMovieFinder implements MovieFinder {

	private static final List<Movie> movies = new ArrayList<>();
	
	public InMemoryMovieFinder () {
		movies.add(new Movie(1L, "Batman vs Superman", 200L));
		System.out.println("In memory movie finder - CALLLING");
	} 
	
	@Override
	public List<Movie> findAll() {
		return movies;
	}
}
