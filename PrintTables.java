package com.test;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter table(s) limit to print: ");
		int limit = input.nextInt();
		System.out.println("");

		for (int b = 2; b <= limit; b++) {
			System.out.println("Table number: " + b);
			for (int c = 1; c <= 10; c++) {
				System.out.println(c + " x " + b + " = " + (c * b));
			}
			System.out.println("=================");
		}
		input.close();
	}
}
