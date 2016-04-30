package edu.fatec.di;

public class Movie {
	
	private long id;
	private String name;
	private long duration;
	
	public Movie(Long id, String name, long duration) {
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	
}
