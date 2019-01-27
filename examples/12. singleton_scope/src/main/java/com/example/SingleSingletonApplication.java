package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
 * When a Spring bean is scoped as a singleton, 
 * the Spring IoC container creates exactly one instance of the object 
 * defined by that bean definition. By default, 
 * the Spring IoC container creates and 
 * initializes all beans as a singleton. 
 * But we can define the scope of a bean as singleton using the scope="singleton" attribute 
 * of the <bean/> element or using the 
 * @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) annotation.
*/
@SpringBootApplication
public class SingleSingletonApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SingleSingletonApplication.class, args);
//		AnnotationConfigApplicationContext context = 
//	            new AnnotationConfigApplicationContext(AppConfig.class);


	      UserService userService1 = context.getBean(UserService.class);
	      userService1.setUserName("RESTful");
	      System.out.println(userService1.getUserName());
	      System.out.println(userService1.hashCode());
	      
	      //asking context to give UserService object twice 
	      UserService userService2 = context.getBean(UserService.class);
	      //below statement will return same UserService object
	      System.out.println(userService2.getUserName());
	      System.out.println(userService2.hashCode());

	      context.close();
	}

}

