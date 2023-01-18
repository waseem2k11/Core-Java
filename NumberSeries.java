package com.hackerrank.demos;

import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String series = "";
            int power = 0;
            for (int j = 0; j < n; j++) {

                series += (a + 1 * b) + power * b + " ";
                power += power + 2;
            }
            System.out.print(series);
        }
        in.close();
    }
}
