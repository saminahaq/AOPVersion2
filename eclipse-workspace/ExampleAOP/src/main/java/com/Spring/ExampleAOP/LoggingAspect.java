package com.Spring.ExampleAOP;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * so this is aspect, but we need to defined when and where it should be run, these called "point cut" 
 * so,
 * when = @Before
 * where = com.Spring.ExampleAO.ShoppingCart.checkOut()
 */

//@Before("execution(* ExampleAOP.ShoppingCart.checkOut(..))") //here start for the return type //(..) for input parameter 


@Component //that means this in inside spring lookup
@Aspect

public class LoggingAspect {

	@Before("execution(* com.Spring.ExampleAOP.ShoppingCart.checkOut(..))")
	public void beforeLogging(JoinPoint jp) {
		//System.out.println(jp.getSignature()) ;
		String args =jp.getArgs()[0].toString();
		System.out.println("Before : Logging with arguments : "+args);
	}
	
	@After("execution(* *.*.*.*.checkOut(..))")
	public void afterLogging() {
		System.out.println("After : Logging Aspect ");

	}
	
	@Pointcut("execution(* com.Spring.ExampleAOP.ShoppingCart.quantity(..))")
	public void afterreterningPointCut(Joinpoint jp) {
		// TODO Auto-generated method stub
		

	}
	
//	@AfterReturning(pointcut = "afterreterningPointCut()")
//	public void afterReturning(String val) {
//		// TODO Auto-generated method stub
//			System.out.println("after returniing : " + val);
//	}
	
}
