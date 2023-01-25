package com.test;

public class LeftTraingle {

	public static void main(String[] args) {
		
		for (int a = 1; a <= 10; a++) {
			for (int b = a; b < 10; b++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
