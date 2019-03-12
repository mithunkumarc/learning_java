### if command line runner and application runner has both order(1), then application runner runs first

### command line runner without order runs at the end of those which has order, same for app runner



### multiple command line runners with priority using @Order(n), without @Order will run last


using boot 2.1.2

command line runner :

runs before spring boot starts : 
tasks which must run before app starts : database connections


When you want to execute some piece of code exactly before the application startup completes, you can use it then.

---

Spring Boot provides two interfaces, CommandLineRunner and ApplicationRunner, to run specific pieces of code 
when an application is fully started. 

These interfaces get called just before run() once SpringApplication completes.


---
Difference : arguments in run method

commandlinerunner : 

        @Component
        public class CommandLineAppStartupRunner implements CommandLineRunner {
            @Override
            public void run(String...args) throws Exception {
              //
            }
        }

ApplicationRunner

          @Component
          public class AppStartupRunner implements ApplicationRunner {
              @Override
              public void run(ApplicationArguments args) throws Exception {
                //        
              }
          }
