package com.Spring.ExampleAutowiring;


//autowiring through XML
public class Employee {
	
	/*
	 * in config file the bean of the Address name should be same 
	 * <bean class="com.Spring.ExampleAutowiring.Address" id="address"> this field in both place "address" be same 
	 */
	private Address address;


	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Contructor");//constructor used this not setting method
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
	
	

}
