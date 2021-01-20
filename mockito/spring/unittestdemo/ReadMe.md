
source : https://github.com/in28minutes/spring-unit-testing-with-junit-and-mockito

1. create packages in src/test/java similar to packages in src/main/java

        src/test/java : contains unit test files
        src/main/java : contains source files

2. mockito and junit both are used for unittesting

3. testing controller includes mocking request, mock and stub service and verify

4. integration test not convered in this example

5. learn

      mock : mock object without stubbing method, method has no default return value
      spy : spy object, without stubbing method, method works as realtime behaviour
      
      
6. mockbean : Autowired [dependency injection] object is marked as mockbean

        example : ItemService, it has further dependencies

        mockbean : as we use mock in mockito, we use mockbean as mock in spring context
        
7. mock and injectmock

        object which need other object as dependencies marked with InjectMocks
        object which has no dependency(independent objects) marked with mock
