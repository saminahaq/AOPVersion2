package com.Spring.ExampleAutowiringAnnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	

	@Autowired
	@Qualifier("tempAddress2") //for multiple beans 
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	

}
