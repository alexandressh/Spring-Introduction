package edu.fatec.di;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMovieFinder implements MovieFinder{

	@Override
	public List<Movie> findAll() {
		System.out.println(this.getClass().getSimpleName());
		return new ArrayList<>();
	}

}
