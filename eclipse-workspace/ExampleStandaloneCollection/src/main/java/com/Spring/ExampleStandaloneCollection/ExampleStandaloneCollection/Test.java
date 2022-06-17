package com.Spring.ExampleStandaloneCollection.ExampleStandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  Stand alone Collection
 * for Stand alone Collection, we need to add these belwo two line in config file 
 *  
 *  xmlns:util="http://www.springframework.org/schema/util"
 *  
 *  http://www.springframework.org/schema/util
 *  https://www.springframework.org/schema/util/spring-util.xsd
 *  
 *  at the end of the config top part
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		System.out.println( "Stand alone Collection" );
		ApplicationContext  context= new ClassPathXmlApplicationContext("standAloneConfig.xml");
		Person  persson =(Person) context.getBean("pers",Person.class);
		
		//System.out.println(persson);
		//persson.getFriends().add("Shawn");
		
		//persson.getFeesStruture().put("Python", 852147);
		System.out.println(persson);
	}

}
