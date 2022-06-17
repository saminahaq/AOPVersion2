package com.Spring.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
	
	private String empName;
	private List<String> phones;
	private Set<String>  adresses;
	private Map<String, String> courses; //name and duration
	

	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String empName, List<String> phones, Set<String> adresses, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		this.adresses = adresses;
		this.courses = courses;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAdresses() {
		return adresses;
	}
	public void setAdresses(Set<String> adresses) {
		this.adresses = adresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employees [empName=" + empName + ", phones=" + phones + ", adresses=" + adresses + ", courses="
				+ courses + "]";
	}
	
	
	
	

}
