package com.example.strings;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        int result = String.valueOf(A.charAt(0)).compareTo(String.valueOf(B.charAt(0)));
        if (result < 0 || result == 0)
            System.out.println("No");
        else
            System.out.println("Yes");

        System.out.print(String.valueOf(A.charAt(0)).toUpperCase() + "" + A.substring(1, A.length()) +
                " " + String.valueOf(B.charAt(0)).toUpperCase() + "" + B.substring(1, B.length()));
    }
}
