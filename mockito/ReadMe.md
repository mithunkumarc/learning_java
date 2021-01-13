Mock : 
  
      if you want to test a method of a java class. You need not to create new instance using new operator. 
      Because there may be dependecies to create.
      Instead of creating new instance we can use frameworks like mockito to create mock object.
      
eg : 

      List mockedList = mock(List.class);  // creating mock object of List class without using new operator.
      
Stub : 

      you can mock response of a method when it is called. It is called stubbing.
      You don't need implementation of method. It will be helpful especially if you are stubbing interface method.
      
eg : 

      // LinkedList object is mocked
      LinkedList mockedList = mock(LinkedList.class);   
      // in below line, preparing mock response when a method from mock object is called
      // when get() is called on mocked object, "first" value would be returned.
      when(mockedList.get(0)).thenReturn("first");      
      
      
       
