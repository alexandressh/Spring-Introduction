package edu.fatec.di;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class MovieSearch {

	private MovieFinder finder;
	
	
	public MovieSearch () {
		this.finder = new CsvMovieFinder(new File("src/main/resources/movies.csv"));
	}
	
	public List<Movie> findByName (String name) {
		return finder
			.findAll()
			.stream()
			.filter(m -> m.getName().matches(".*" + name + ".*"))
			.collect(Collectors.toList());
		
	}
	
}
