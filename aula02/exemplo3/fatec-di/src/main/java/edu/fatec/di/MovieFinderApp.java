package edu.fatec.di;

public class MovieFinderApp {

	
	public static void main(String [] args){
		MovieSearch search = new MovieSearch();
		System.out.println(search.findByName("a"));
	}
}
