package com.test;

public class ReverseString {

	public static void main(String[] args) {

		// without inbuilt method
		String s = "reverse me";		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		// with inbuilt method
		StringBuilder sb = new StringBuilder(s);
		System.out.print(sb.reverse());
	}

}
