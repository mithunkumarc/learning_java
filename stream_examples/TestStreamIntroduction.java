package stream_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * A Stream in Java can be defined as a sequence of elements from a source 
 * that supports aggregate operations on them. 
 * The source here refers to a Collections or Arrays who provides data to a Stream.
 * Stream doesn't stores data, so it is not a datastructure.
 * 
 * of(singleElement)
 * of(multipleElements)
 * ofNullable(mayIncludeNullValue)
 * */

public class TestStreamIntroduction {
	public static void main(String[] args) {
		// creating simple stream
		Stream<Integer> s = Stream.of(1);//stream of only one value
		s.forEach(System.out::println);// 1
		System.out.println("*".repeat(10));
		
		//stream of multple values
		Stream<Integer> s1 = Stream.of(1,2,3,4,5);// added null here but no error
		s1.forEach(System.out::println);
		
		// nullable stream
		Stream<Integer> s3 = Stream.ofNullable(null);
		s3.forEach(System.out::println);//no output
		
		// list with null value
		Stream<List<String>> s4 = Stream.ofNullable(Arrays.asList("one",null,"three"));
		s4.forEach(System.out::println);// prints null too
	}
}
