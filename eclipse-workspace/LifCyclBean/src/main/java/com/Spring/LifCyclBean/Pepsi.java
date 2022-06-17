package com.Spring.LifCyclBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Bean life cycle Using Interface 
public class Pepsi implements InitializingBean, DisposableBean{
	
	private double price;

	
	
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pepsi init method");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pepsi destroy method");
		
	}
	
	
	

}
