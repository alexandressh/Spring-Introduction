package edu.fatec.di.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.fatec.di.Movie;
import edu.fatec.di.MovieFinder;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	@Qualifier("movieFinder3")
	private MovieFinder finder;
	
	
	@Override
	public List<Movie> findMovies() {
		return finder.findAll();
	}
	

}
