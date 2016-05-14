package edu.fatec.di;

import java.util.List;
import java.util.stream.Collectors;

public class MovieSearch {

	private MovieFinder finder;
	
	
	public MovieSearch (MovieFinder finder) {
		this.finder = finder;
		if(finder == null){
			throw new IllegalArgumentException("Parameter finder cannot be null");
		}
	}
	
	public List<Movie> findByName (String name) {
		return finder
			.findAll()
			.stream()
			.filter(m -> m.getName().matches(".*" + name + ".*"))
			.collect(Collectors.toList());
		
	}
	
}
