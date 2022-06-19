package ExampleAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
	
/*
 * instead of making the config.xml we can create the Beanconfig file for the bean configuration based on the bean
 * These are in total five aspect e.g after, after returning, after throwing, around the method etc 
 * 
 */

@Aspect
@Component

public class LoggingAspect {
	

	@Before("execution(*  ExampleAop.ShoppingCart.checkOut(..))") //for input parameter (..)
	public void beforeLogging(JoinPoint jp) {
		//System.out.println(jp.getSignature());
		String input = jp.getArgs()[0].toString();
		System.out.println(input);
		System.out.println("Before Logging");

	}
	
	@After("execution(* *.*.checkOut(..))")
	public void afterLogging() {
		System.out.println("After Logging");

	}
	
	
	
	
	

}
