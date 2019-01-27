package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bean.MyBusinessService;

/* add aspects dependency in spring boot*/
/* right click on project, select spring, select edit_starters*/

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
		String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context = 
                        new org.springframework.context.support.ClassPathXmlApplicationContext(confFile);
        MyBusinessService busServ = (MyBusinessService) context.getBean("busService");
        busServ.runMyBusinessLogic();
	}

}

