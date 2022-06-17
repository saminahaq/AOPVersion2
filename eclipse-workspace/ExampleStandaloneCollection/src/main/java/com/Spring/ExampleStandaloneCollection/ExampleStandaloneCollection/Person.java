package com.Spring.ExampleStandaloneCollection.ExampleStandaloneCollection;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer>  feesStruture;
	private List<Projects> projects;

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(List<String> friends, Map<String, Integer> feesStruture, List<Projects> projects) {
		super();
		this.friends = friends;
		this.feesStruture = feesStruture;
		this.projects = projects;
	}

	public List<Projects> getAddress() {
		return projects;
	}
	public List<String> getFriends() {
		return friends;
	}
	
	public Map<String, Integer> getFeesStruture() {
		return feesStruture;
	}

	public void setAddress(List<Projects> projects) {
		this.projects = projects;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public void setFeesStruture(Map<String, Integer> feesStruture) {
		this.feesStruture = feesStruture;
	}
	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStruture=" + feesStruture +  " , Projects= "+ projects +"]";
	}


	


}
