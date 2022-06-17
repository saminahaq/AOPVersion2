
package com.Spring.Collection;
import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * if we make list outside of the bean thatis called stand alone collection
 * we can do this with List
 * with Set it will not possible because Set cannot  be added without propert tags
 */


public class Test {
	public static void main(String[] args) {
		
		System.out.println( "Employees!" );
		ApplicationContext context=new ClassPathXmlApplicationContext("emply-config.xml");
		Employees emp1 = (Employees)context.getBean("emp1");
		//System.out.println(emp1);
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getAdresses());
		
	}

}
