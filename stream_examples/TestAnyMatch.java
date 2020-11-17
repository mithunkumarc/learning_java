package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestAnyMatch {
	public static void main(String[] args) {
		
		/*
		 * anyMatch : if any one of the element matches the predicate/condition, returns true
		 * */
		
		List<Integer> numbersList = Arrays.asList(1,2,3,4,5);
		Predicate<Integer> isLessThan6Predicate = n -> n < 6;
		Predicate<Integer> isEvenPredicate = n -> n % 2 == 0;
		Predicate<Integer> isNegetivePredicate = n -> n < 0;
		
		// all numbers are less than 6, so output is true
		boolean flag = numbersList.stream().anyMatch(isLessThan6Predicate);
		System.out.println(flag); // true
		
		// two numbers are even , so output is true
		boolean isEvenFlag = numbersList.stream().anyMatch(isEvenPredicate);
		System.out.println(isEvenFlag); // true, because 2, 4 are even numbers
		
		// none of the numbers are negetive so output is false
		boolean isNegativeFlag = numbersList.stream().anyMatch(isNegetivePredicate);
		System.out.println(isNegativeFlag); // false, because none of the number from list are < 0
		
	}
}
