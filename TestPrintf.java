package com.example.introduction;

import java.util.Scanner;

public class TestPrintf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = new String[3];
        int[] in = new int[3];

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {

            str[i] = sc.next();
            in[i] = sc.nextInt();
        }

        // call method and pass both arrays
        myMethod(str, in);

        // close the scanner
        sc.close();
        System.out.println("================================");
    }

    private static void myMethod(String[] str, int[] in) {

        for (int i = 0; i < str.length; i++) {
            System.out.printf("%-15s", str[i]);
            System.out.printf("%03d", in[i]);
            System.out.println();
        }

    }
}
