package com.Spring.ExampleAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//instead of config.xml , we can create the BeanConfig, this is another way to config 

@Configuration 
@ComponentScan(basePackages = "com/Spring/ExampleAOP")
@EnableAspectJAutoProxy
public class BeanConfig {

}
