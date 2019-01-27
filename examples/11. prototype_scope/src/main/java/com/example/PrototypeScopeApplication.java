package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
 * When a spring bean is scoped as a prototype, 
 * the Spring IoC container creates new bean instance every time when a request is made for that bean.
 * We can define the scope of a bean as prototype using scope="prototype" attribute of <bean/> element or 
 * using @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) annotation.
*/
@SpringBootApplication
public class PrototypeScopeApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(PrototypeScopeApplication.class, args);
//		AnnotationConfigApplicationContext context = 
//	            new AnnotationConfigApplicationContext(AppConfig.class);


	      UserService userService1 = context.getBean(UserService.class);
	      userService1.setUserName("RESTful");
	      //output : RESTful
	      System.out.println(userService1.getUserName());

	      //asking context to give new UserService object 
	      UserService userService2 = context.getBean(UserService.class);
	      //below statement will return null
	      System.out.println(userService2.getUserName());
	      context.close();
	
	}

}

