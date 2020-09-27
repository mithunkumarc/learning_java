package examples;

import java.util.Scanner;

/* example for hcf for 12 and 8
 * 12 : common factors of 12 are 1, 2, 3 , 4 , 6 , 12
 * 8 : common factors of 8 are 1, 2, 4 , 8
 * common factors of 12 and 8 are 1 , 2 and 4
 * so highest common factor is 4
 * */

public class TestHcf {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		int hcf = 0;
		// loop should go till the end of big number
		for(i = 1; i <= a || i <= b ; i++ ) {
			if(a % i == 0 && b % i == 0) {
				// if i is common factor of both a and b , update hcf
				hcf = i; // last common factor becomes the highest common factor
			}
		}
		System.out.println("HCF "+ hcf);
	}
}
