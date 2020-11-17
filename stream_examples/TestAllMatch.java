package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestAllMatch {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1,2,3,4,5);
		Predicate<Integer> isLessThan6Predicate = n -> n < 6;
		boolean flag = numbersList.stream().allMatch(isLessThan6Predicate);
		// all numbers are less than 6, so output is true
		System.out.println(flag); // true
	}
}
