package com.Springs.ReferenceType;

import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefDataType {
	
	public static void main(String[] args) {
		
		
		System.out.println( "Reference Type!" );
		ApplicationContext context= new ClassPathXmlApplicationContext("refType-config.xml");
		A a = (A)context.getBean("Aref");
		System.out.println("B Id : "+a.getB().getId());
		System.out.println("A Id : "+a.getId());
	}

}
