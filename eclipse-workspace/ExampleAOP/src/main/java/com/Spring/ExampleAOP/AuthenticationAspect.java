package com.Spring.ExampleAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * defined different sorts of point cut
* com.Spring.ExampleAOP.ShoppingCart.checkOut(..)
 */

@Component
@Aspect
public class AuthenticationAspect {
	
	
	//Point cut created
	@Pointcut("within(com.Spring.ExampleAOP..*)") //for rest of the class
	public void authenticationPointCut() {
		

	}
	//Point cut created
	@Pointcut("within(com.Spring.ExampleAOP..*)") 
	public  void authorizationPointCut() {
		

	}
	
	//calling point cuts
	
	@Before("authenticationPointCut() && authorizationPointCut()")
	public void authentication() {
		System.out.println("Authenticating the resquest ");

	}
	

}
