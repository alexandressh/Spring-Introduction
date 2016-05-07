package edu.fatec.di;

public class MovieFinderFactory {

	public MovieFinder createBean(){
		System.out.println("Chamando factory");
		InMemoryMovieFinder csvFinder = new InMemoryMovieFinder();
		return csvFinder;
	}
}
