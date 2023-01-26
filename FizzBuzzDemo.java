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
