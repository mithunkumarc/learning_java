      dependencies : jdbc , mysql


      create database otp;
      use otp;
      CREATE TABLE `item` (
        `id` INT(11) NULL DEFAULT NULL,
        `name` VARCHAR(50) NULL DEFAULT NULL,
        `category` VARCHAR(50) NULL DEFAULT NULL
      );


      # Database
      server.port=8080
      spring.datasource.driver-class-name: com.mysql.cj.jdbc.Driver
      spring.datasource.url: jdbc:mysql://localhost:3306/otp?useSSL=false
      spring.datasource.username: root
      spring.datasource.password: root

