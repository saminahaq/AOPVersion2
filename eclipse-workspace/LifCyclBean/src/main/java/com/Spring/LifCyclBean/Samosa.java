package com.Spring.LifCyclBean;

public class Samosa {
	
	private int price;

	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Samosa(int price) {
		super();
		this.price = price;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		System.out.println("Setting price");
		this.price = price;
	}



	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		// TODO Auto-generated method stub
		/*
		 * public void hi(){} //function name can be changes but signature shoudl be same
		 * also , change in the config.xml files 
		 * init-method= "hi"  
		 */
		System.out.println("Inside the init method");

	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		/*
		 * public void bye(){} //function name can be changes but signature shoudl be same
		 * destroy-method ="bye"
		 */
		System.out.println("Inside the destroy method");

	}
	

}
