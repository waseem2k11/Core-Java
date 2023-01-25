package com.test;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {

		int x, y;
		System.out.println("Enter x and y");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("x and y before swapping: x = " + x + " y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("x and y after swapping: x = " + x + " y =  " + y);
		
		sc.close();
	}

}
