package edu.fatec.di.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fatec.di.Movie;
import edu.fatec.di.MovieFinder;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieFinder finder;
	
	@RequestMapping(value = {"/", ""},
					method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> findAll() {
		List<Movie> list = finder.findAll();
		
		return new ResponseEntity<List<Movie>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/", ""},
					method = RequestMethod.POST)
	public ResponseEntity<Movie> create(@RequestBody Movie movie) {
		Movie movieRet = finder.create(movie);
		return new ResponseEntity<Movie>(movieRet, HttpStatus.CREATED);
	}
}
