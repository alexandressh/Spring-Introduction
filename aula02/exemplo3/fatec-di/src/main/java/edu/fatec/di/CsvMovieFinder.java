package edu.fatec.di;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvMovieFinder implements MovieFinder{

	private File file;
	
	public CsvMovieFinder(File file){
		this.file = file;
	}
	
	private Long getLongFromLine(String line, int index){
		return Long.valueOf(line.split("\\;")[index]);
	}
	private String getStringFromLine(String line, int index){
		return line.split("\\;")[index];
	}
	
	
	@Override
	public List<Movie> findAll() {
		
		try {
			List<String> lines = Files.readAllLines(Paths.get(file.toURI()));
			List<Movie> movies = new ArrayList<>();
			for(String line : lines){
				Movie movie = new Movie(getLongFromLine(line, 0), 
										getStringFromLine(line, 1), 
										getLongFromLine(line, 2) * 60);
				movies.add(movie);
			}
			return movies;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ArrayList<>();
	}

	
	
}
