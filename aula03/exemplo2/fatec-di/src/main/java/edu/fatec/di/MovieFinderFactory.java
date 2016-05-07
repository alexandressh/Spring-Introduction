
package edu.fatec.di;

public class MovieFinderFactory {
	
	public MovieFinder createBean() {
		InMemoryMovieFinder csvFinder = new InMemoryMovieFinder();
		return csvFinder;
	}
}
