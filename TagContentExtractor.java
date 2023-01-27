package com.hackerrank.examples;

import java.util.Scanner;

public class TagContentExtractor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			String startTag = line.substring(line.indexOf("<") + 1, line.indexOf(">"));
			String content = line.substring(line.indexOf(startTag) + startTag.length() + 1, line.indexOf("</" +startTag+ ">"));
			String endTag = line.substring(line.indexOf("</") + content.length() + 2, line.indexOf(">"));
			
			System.out.println(startTag);
			System.out.println(content);
			System.out.println(endTag);

			testCases--;
		}
		in.close();
	}

}
