package stream_examples;

import java.util.stream.Stream;

public class TestStreamBuilder {
	public static void main(String[] args) {
		
		/*
		 * A mutable builder for a Stream. 
		 * This allows the creation of a Stream by generating elements individually 
		 * and adding them to the Builder 
		 * (without the copying overhead that comes from using an ArrayList as a temporary buffer.)
		 * */
		
		System.out.println("String.builder using add() " + "*".repeat(10));
		// Stream.Builder add() function returns builder so we can keep calling add() till we decide to build
		Stream<Integer> s = Stream.<Integer>builder().add(1).add(2).build();
		s.forEach(System.out::println);
		
		System.out.println("String.builder using accept() " + "*".repeat(10));
		// Strem.Builder accept() function returns void . so we need to call accept on builder object everytime separately
		Stream.Builder<String> sb = Stream.builder();
		sb.accept("hello");
		sb.accept("welcome to");
		sb.accept("java 11");
		Stream<String> s2 = sb.build();
		s2.forEach(System.out::println);

	}
}
