/*
* Title: FizzBuzz (Java Logical Program)
* Author: Waseem Ahmed
* Description:
*     Program that prints the numbers from 1 to n. But for multiples of
*     3 print "Fizz" instead of the number and for the multiples of five
*     print "Buzz". For numbers which are multiples of both three and five
*     print "FizzBuzz". For numbers which are neither multiplies of 3 and nor 5, print that number
*     and each result will be printed on new line.
*/

package com.test;

import java.util.Scanner;

public class FizzBuzzDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		FizzBuzzDemo.fizzBuzz(n);
		input.close();
	}

	private static void fizzBuzz(int n) {

		String result = null;

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0) {
				result = "Fizz";
				if (i % 5 == 0) {
					result += "Buzz";
				}
			} else if (i % 5 == 0)
				result = "Buzz";
			else
				result = String.valueOf(i);

			System.out.println(result);
		}
	}

}
