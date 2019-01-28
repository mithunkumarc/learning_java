> In Spring framework, we can manage lifecycle of a bean by using method-level annotations @PostConstruct and @PreDestroy.

> The @PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to 
perform any initialization.

> The @PreDestroy annotation is used on methods as a callback notification to signal that the instance is in the 
process of being removed by the container.



output : 

        Inside init method - {port=25, host=mail.example.com, from=admin@gmail.com}
        2019-01-28 15:42:01.720  INFO 2866 --- [           main] com.example.LifeCycleBeanApplication     : Started LifeCycleBeanApplication in 1.766 seconds (JVM running for 2.623)
        Inside send method - user1@example.com
        Inside send method - uesr2@example.com
        Inside destroy method - {}
