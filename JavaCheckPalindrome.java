package com.example.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaCheckPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (A.length() <= 50) {

            String isPalindrome = "";
            for (int i = 0; i < A.length(); i++) {
                if (String.valueOf(A.charAt(i)).compareTo(String.valueOf(A.charAt(A.length() - (i + 1)))) == 0) {
                    isPalindrome = "Yes";
                } else {
                    isPalindrome = "No";
                }
            }
            System.out.println(isPalindrome);
        }
    }
}
