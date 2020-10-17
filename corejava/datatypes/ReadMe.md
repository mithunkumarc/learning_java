1. byte	1 byte	  Stores whole numbers from -128 to 127  
2. short	2 bytes	  Stores whole numbers from -32,768 to 32,767  
3. int	4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647  
4. long	8 bytes	  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  
5. float	4 bytes	  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits  
6. double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits  
7. boolean	1 bit	  Stores true or false values  
8. char	2 bytes	  Stores a single character/letter or ASCII values  

##### float vs double

        The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. 
        Therefore it is safer to use double for most calculations.
  
        float f = 342.234555555f; // output : 342.23456
        double d = 2342.3434543534535353453453345d; // output : 2342.3434543534536

#### finding datatype sizes: two ways to find

Java has no sizeof operator to find the size of primitive data types. 
So use Wrapper class Constants SIZE(in bits so divide by 8) OR BYTES

        <WrapperClassName.SIZE>/8
        Character.SIZE/8

        or

        <WrapperClassName.Bytes>
        Character.Bytes

  





#### explore : 

wrapper classes
Boxing AutoBoxing UnBoxing
