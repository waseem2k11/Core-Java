package com.example.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String after = s.trim().replaceAll(" +", " ");

        String[] regexStr = after.split("[ !,?._'@]+");

        if (!after.equals("") && regexStr.length > 0) {
            System.out.println(regexStr.length);
            for (String st: regexStr) {
                System.out.println(st);
            }
        } else System.out.println("0");

        scan.close();
    }
}
