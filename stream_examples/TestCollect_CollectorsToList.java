package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollect_CollectorsToList {
	public static void main(String[] args) {
		/*
		 * collect : Performs a mutable reduction operation on the elements of this stream using a Collector.
		 * */
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// collect method accept collector(I) as parameter , Collectors has list of method which returns Collector(class impl Collector) object
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);
		
	}
}
