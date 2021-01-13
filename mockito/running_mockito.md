1. create maven project
2. add junit and mockito dependencies.
3. check which junit to use. 4 or 5.
4. at the time of practicing mockito, i have used junit 4.

          <dependencies>
              <!-- https://mvnrepository.com/artifact/junit/junit -->
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.13</version>
                <scope>test</scope>
            </dependency>
              <!-- https://mvnrepository.com/artifact/org.mockito/mockito-core -->
            <dependency>
                <groupId>org.mockito</groupId>
                <artifactId>mockito-core</artifactId>
                <version>3.7.0</version>
                <scope>test</scope>
            </dependency>  	
            </dependencies>

5. create junit testcase, run as junit testcase       

      //example: 
      package com.example;

      import static org.junit.Assert.*;
      import static org.mockito.Mockito.mock;
      import static org.mockito.Mockito.verify;
      import static org.mockito.Mockito.when;

      import java.util.List;

      import org.junit.Test;

      public class SomeMockito {

        @Test
        public void test() {
          //fail("Not yet implemented");
          List mockedList = mock(List.class);
          //when(mockedList.get(0)).thenReturn(3);
          //assertEquals(3, mockedList.get(0));
          mockedList.add("one");
          verify(mockedList).add("one");    // verify whether add method was called on mockedList object
        }

      }
