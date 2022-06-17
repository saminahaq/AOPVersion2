package com.Spring.ExampleAutowiringAnnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * Note[annotation need to add <context:annotation-config /> into config file]
 *  Autowiring through : annotation , there are three ways 
 * 1: autowired at data filed (at property) used ByType in config xml
 * 2: at setter method  [OR]
 * 3: at constructor [OR]
 * 
 * Another annotation 
 * @qualifier  : used with @Autowired annotation
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Autowiring through : annotation " );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("autwiringAnotation.xml");
        Employee emp= (Employee) context.getBean("employee", Employee.class);
        System.out.println(emp );
    }
}
