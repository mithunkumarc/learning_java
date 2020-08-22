package method_reference;
import java.util.ArrayList;
import java.util.List;

class Person {
	
	public Person(String name) {
		System.out.println(name + " : person created");
	}
	public Person() {
		
	}
	static void print(String name) {
		System.out.println(name);
	}
	void printPerson(String name) {
		System.out.println(name);
	}
}

public class TestMethodReference {
	public static void main(String[] args) {	
	List<String> list = new ArrayList<String>(); 
        list.add("rajat"); 
        list.add("prakash"); 
        list.add("abhinith");      
        
        // 1. using double colon operator 
        list.forEach(Person::print); // list is iterating string, so print should accept string
        
        // 2. call the instance method 
        list.forEach((new Person())::printPerson); // printPerson should accept string
        
        // 3. calling constructor
        list.forEach(Person::new);
	}
}
