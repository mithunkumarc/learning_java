package optional_example;

import java.util.Optional;

class User {
	private String name;
	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

/*
 * User u = someFunction();
 * here u could be null, you may get Null pointer exception if u didnt check
 * better way to check Null values is by using Optional<T>
 * Optional is not replacement to check null, but a better way to check null values
 * */


public class TestOptionalExample {
	public static void main(String[] args) {
		User u = null;
		//System.out.println(u.getName());// NullPointer Exception
		TestOptionalExample t = new TestOptionalExample();
		System.out.println(t.getMeUser().isEmpty()); // true
		System.out.println(t.getMeUser().isPresent()); // false
		// you don't know whether the object coming is null/empty 
		// check it before using it
		System.out.println(t.getMeNullableUser().isEmpty()); // true
		System.out.println(t.getMeNullableUser().isPresent()); // false
	}
	Optional<User> getMeUser() {
		Optional<User> opUser = Optional.empty();
		return opUser;
	}
	Optional<User> getMeNullableUser() {
		User u = null;
		Optional<User> opNullable = Optional.ofNullable(u);// user can be null
		return opNullable;//i could send null or user object, yay
	}
}
