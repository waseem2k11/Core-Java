package com.example.strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {

        boolean result;

        if (a.length() == b.length()) {

            char[] ArrayS1 = a.toLowerCase().toCharArray();
            char[] ArrayS2 = b.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            result = Arrays.equals(ArrayS1, ArrayS2);

        } else result = false;

        return result;
    }
}
