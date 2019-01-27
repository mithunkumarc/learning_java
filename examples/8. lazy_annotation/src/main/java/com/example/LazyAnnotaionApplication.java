package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/*
 * 
 * spring will create bean objs when app is started.
 * if bean is assigned lazy annotation , that bean will be skipped.
 * By default, the Spring IoC container creates and initializes all singleton beans at time of application start up. 
 * We can prevent this pre initialization of a singleton beans by using the @Lazy annotation.
*/

@SpringBootApplication
public class LazyAnnotaionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  cac = SpringApplication.run(LazyAnnotaionApplication.class, args);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//	      //Initialize lazy bean ; bean is created on demand
	      System.out.println("now first bean initializing");
	      FirstBean bean=cac.getBean(FirstBean.class);
	      bean.doSomthing();
	      cac.close();
	}

}

