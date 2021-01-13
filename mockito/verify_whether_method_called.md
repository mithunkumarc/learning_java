
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
            mockedList.add("one"); // or this line is may be inside code under test
            // verify wheter add method is called with parameter "one"
            verify(mockedList).add("one");
          }

        }
