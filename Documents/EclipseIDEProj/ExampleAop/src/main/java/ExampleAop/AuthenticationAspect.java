package ExampleAop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

///////////////////////////////////////Creating Point cuts	///////////////////////////////////////
	@Pointcut("within(ExampleAop..*)")//any class and method under the ExampleAop package
	public void authenticatingPonitCut() {
		
	}
	
	@Pointcut("within(ExampleAop..*)") //here any method under the shopping Cart class
	public void authorizationPointCut() {
		
	}
	@Pointcut("execution(* ExampleAop.*.quantity(..))")
	public void afterReturningPointCut() {
		
	}
	
///////////////////////////////////////calling Point cuts	///////////////////////////////////////	
	
	@Before("authenticatingPonitCut() &&  authorizationPointCut() ")
	public void authenticate() {
		System.out.println("Authentication and Authorization Request");

	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning  = "retVal")
	public void afterReturning(String retVal) {
		System.out.println("After Returning value : "+ retVal );

	}

	

	
}
