package com.Spring.ExampleAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Tutorial : AOP
 * AOP separate out he cross cutting concern, so all the cross cutting concern call aspect 
 * These are cross cutting concern called aspect in AOP, so we need to create separate aspect for these cross cutting concerns
 * 1: logging
 * 2: authentication and authorization
 * 3: sanitize the data
 * 
 * []
 * Now we need to defined when and where these aspects should be run, these called "point cut" 
 * so , at the shoppingCart class should called the logging aspect than shoppingCart class called the "joint cut"
 * 
 * So, whenever checkOut() method execute i want to call the logging() method
 * ,so for Looging() method need to defined the @Before
 *
 * 
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Tutorial : AOP " );
        
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart carts =context.getBean(ShoppingCart.class);
        carts.checkOut("Approved");
        carts.quantity();
    }
}
