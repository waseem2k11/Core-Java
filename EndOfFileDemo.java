package com.example.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFileDemo {
    public static void main(String[] argh) {

        Scanner input = new Scanner(System.in);
        int lines = 1;
        while (true)
        {
            String line = input.nextLine();
            System.out.println(lines + " " + line);
            lines++;
            if (!input.hasNext())
            {
                break;
            }
        }
        input.close();
    }
}
