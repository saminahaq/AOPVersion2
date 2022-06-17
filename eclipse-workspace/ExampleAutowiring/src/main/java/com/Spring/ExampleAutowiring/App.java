package com.Spring.ExampleAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *autowiring through XML
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "autowiring through XML" );
        
        ApplicationContext context =new ClassPathXmlApplicationContext("autoConfig.xml");
        Employee emp= (Employee) context.getBean("employee");
        System.out.println(emp );
    }
}
