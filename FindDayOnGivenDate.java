package com.hackerrank.demos;

import java.io.*;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FindDayOnGivenDate {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\test.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = FindDayOnGivenDate.findDay(month, day, year);
        System.out.println(res);
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String findDay(int month, int day, int year) {

        String str = month + " " + day + " " + year;
        String dayOfWeekString = "";
        try {
            SimpleDateFormat formatter1 = new SimpleDateFormat("MM dd yyyy");
            Date date1 = formatter1.parse(str);

            Calendar c = Calendar.getInstance();
            c.setTime(date1);
            DateFormat formatter = new SimpleDateFormat("EEEE");
            dayOfWeekString = formatter.format(c.getTime());

        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        return dayOfWeekString.toUpperCase();
    }
}
