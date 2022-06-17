package com.Springs.ConstructorInjection;

public class Certi {
	private String name;

	
	
	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Certi(String name) {
		super();
		this.name = name;
	}



	@Override
	public String toString() {
		return  this.name ;
	}
	
	
	

}
