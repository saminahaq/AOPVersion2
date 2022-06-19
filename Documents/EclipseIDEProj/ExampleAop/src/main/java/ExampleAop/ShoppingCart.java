package ExampleAop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	/*
	 * These are the cross cutting concerns for the whole system, so we need to separate these as an aspect,
	 * that apply on the specified "pointcuts" 
	 * 1: logging 
	 * 2: Authentication andAuthorization
	 * 3: Data sanitization
	 */


	public void checkOut(String statNew) {
		System.out.println("Checkout method from the Shopping Cart : " + statNew);

	}
	public int quantity() {
		return 20;

	}
	
}
