| Parameters	| Mock	| Spy |
| ----------  | ----  | --- |
| Usage	| Mocks are used to create fully mock or dummy objects. It is mainly used in large test suites.	| Spies are used for creating partial or half mock objects. Like mock, spies are also used in large test suites. |
| Default behavior	| When using mock objects, the default behavior of methods (when not stubbed) is do nothing (performs nothing.) | When using spy objects, the default behavior of the methods (when not stubbed) is the real method behavior. |


spy object : without stub, default method behaviour is real behaviour

eg : 

      ArrayList arrayListSpy = spy(ArrayList.class);
      arrayListSpy.add("Test0");
      System.out.println(arrayListSpy.get(0)); 
      
      // output : Test0
    
When using mock objects, the default behavior of methods (when not stubbed) is do nothing (performs nothing.)    


      ArrayList arrayListSpy = mock(ArrayList.class);
      arrayListSpy.add("Test0");
      System.out.println(arrayListSpy.get(0)); 
      // output : null
