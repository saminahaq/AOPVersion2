package com.Spring.LifCyclBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
      //  Samosa samosa= (Samosa)context.getBean("s1");
     //   System.out.println(samosa); //now used AbstractApplicationcontext instead
        //registeration shut down hook
        context.registerShutdownHook();
        
        
     //   System.out.println("Pepsi");
     //   Pepsi pepsi= (Pepsi)context.getBean("p1");
        
    //    System.out.println(pepsi);
        
        Example examp =(Example)context.getBean("e1");
        System.out.println(examp);
        
        
        
        
        
    }
}
