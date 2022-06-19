package ExampleAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ExampleAop")
@EnableAspectJAutoProxy
public class BeanConfig {

}
