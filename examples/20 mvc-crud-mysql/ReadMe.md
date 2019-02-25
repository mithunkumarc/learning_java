#### project dependencies : 

        spring-boot-starter-data-jpa
        spring-boot-starter-thymeleaf		
        mysql		
        web

#### manually add to pom.xml

          bootstrap
              <dependency>
                <groupId>org.webjars</groupId>
                <artifactId>bootstrap</artifactId>
                <version>3.3.7</version>
              </dependency>

          jquery
              <dependency>
                <groupId>org.webjars</groupId>
                <artifactId>jquery</artifactId>
                <version>1.12.4</version>
              </dependency>

#### database : more info in application.properties

          create database employee_database;
          use employee_database;
          show tables;
          select * from employee;	

