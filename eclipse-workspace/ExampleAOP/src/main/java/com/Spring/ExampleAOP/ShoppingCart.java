package com.Spring.ExampleAOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	public void checkOut(String status) {
		
		//These are cross cutting concern called aspect in AOP
		//Logging
		//Authentication and authorization
		//sanitize the data
		System.out.println("Checkout from the Shopping cart : " + status);

	}

	public int quantity() {
		// TODO Auto-generated method stub
			return 20;
	}
}
