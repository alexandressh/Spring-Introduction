package edu.fatec.di;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMovieFinder implements MovieFinder{

	@Override
	public List<Movie> findAll() {
		//Do some crazy stuff to read movies from database.
		return new ArrayList<>();
	}

	@Override
	public Movie create(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

}
