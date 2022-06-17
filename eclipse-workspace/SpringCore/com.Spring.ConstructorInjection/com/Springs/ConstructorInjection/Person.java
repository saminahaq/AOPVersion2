package com.Springs.ConstructorInjection;

import java.util.List;
import java.util.Set;

//forConstructorInjection
public class Person {

	private String name;
	private int personId;
	private Certi certi;
	private List<String> mylist;
	private Set<String>  mysetList;
	 
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Person(String name, int personId, Certi certi, List<String> mylist, Set<String> mysetList) {
		
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.mylist = mylist;
		this.mysetList = mysetList;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", mylist=" + mylist + ",my Certificate Set=" + mysetList +"]";
	}





	
	
	
	
}
