1. Arithmetic Operators

        +	Addition (Also used for string concatenation.) Left -> Right

        -	Subtraction	Left -> Right

        *	Multiplication	Left -> Right

        /	Division	Left -> Right

        %	Modulo (remainder)	Left -> Right

        -	Unary Minus	Right -> Left (eg : -97.34)


2. Increment Decrement Operators

                Increment Operator (++)

                Decrement Operator (++)


3. Bitwise Operators


                Bitwise Complement (~)
                Bitwise AND (&)
                Bitwise OR (|)
                Bitwise XOR (^) or Exclusive OR
        
        Bitwise Operations on Char Variables
                Bitwise operations can be performed on char datatype as internal reporesentation of 
                characters are ascii code(integers)

        Java Bit Shift Operators
                left shift (<<), 
                right shift (>>) and 
                zero-fill right shift (>>>)



4. Relational Operators

                == (Equal to)
                != (Not equal to)
                > (Greater than)
                < (Less than)
                >= (Greater than or equal to)
                <= (Less than or equal to)



5. Logical Operators

        Java Logical Operators (Short-circuit)
                Logical AND (&&)
                Logical OR (||)

        Java Boolean Operators (Not-short-circuit): used with bitwise
                Boolean AND (&)
                Boolean OR (|)
                Boolean XOR (^)
                Boolean NOT (!)


6. Assignment Operators


        Basic Assignment Operator ( = )

        Reference Assignment
                Student st1 = new Student();
        
        Primitive Assignment
        
                int x = 130; // literal assignment
                int y = x + 2; // assignment with expression
                
        Primitive Casting
        
                int i = 5;		 
		byte c = 3;
		c = (byte) (i + 7); //carefull overflow could happen
		System.out.println(c); // 12
        
        
        Shorthand Assignment Operators

                int x = 3;
		x += 5; // 8

                      

7. Miscellaneous Operators

                ternary or conditional operator

                        expr-1 ? expr-2 : expr-3;

                member access operator(dot .)

                                person.currentAddress

                comma opearatr used between function arguments

                new operator

                instanceOf operator
