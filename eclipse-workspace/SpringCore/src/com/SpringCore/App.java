package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Step # 04
        //create XMP file  [click on SRC-> new -> other -> config.xml ]
        
        /*
         * step # 05 //we dont need create object by ourself instead,
         * we asked IOC container to create and maanged the bean 
         * check the documentation 5 pdf 
         * add new and ClassPathXmlApplicationContext("config.xml");
         * if you add inside the package so give teh full address of the config file
         * and put to the object of the "ApplicationContext"
         */
        
        //context is spring IOC container
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
         Student student1  =(Student)context.getBean("student1");
         System.out.println(student1);
         Student student3  =(Student)context.getBean("student3");
         System.out.println(student3);
         
         /*
          * here code is decoupled so if we need to change teh value just go to the config file and changed the value . 
          *decoupled through setter injection
          */
         
         
         
         
    }
}
