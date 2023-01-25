package com.example.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaSubstring2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            try {
                list.add(s.substring(i, k + i));
            } catch (Exception ex) {
                break;
            }
        }
        Collections.sort(list);

        smallest = list.get(0);
        largest = list.get(list.size()-1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
