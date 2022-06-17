package com.Springs.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstInj {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("constructInject.xml");
		Person pers =  (Person)context.getBean("pers");
	
		//System.out.println(pers);
		
		
		Addition addi = (Addition)context.getBean("addfun");
		addi.doSum();
		
	}

}
