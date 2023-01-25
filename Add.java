package com.example.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Add {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());
        int n6 = Integer.parseInt(br.readLine());

        Add ob = new Add();
        ob.add(n1, n2);
        ob.add(n1, n2, n3);
        ob.add(n1, n2, n3, n4, n5);
        ob.add(n1, n2, n3, n4, n5, n6);

    }

    public void add(int... arr) {
        StringBuffer sb = new StringBuffer();
        int sum = 0;

        for (int a : arr) {
            sum += a;
            sb.append(a + "+");
        }
        System.out.print(sb.deleteCharAt(sb.length() - 1) + "=" + sum + "\n");
    }
}
