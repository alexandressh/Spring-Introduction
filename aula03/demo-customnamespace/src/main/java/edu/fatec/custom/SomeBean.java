package edu.fatec.custom;

public class SomeBean {
	
	private String name;
	private Long id;
	
	public SomeBean(){}
	
	public SomeBean(Long id, String name) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "SomeBean [name=" + name + ", id=" + id + "]";
	}
}
