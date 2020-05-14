package com.CodingBat;

public class Solution4 {

	public static void main(String args[]) {

		/***
		 * Solution 4 Given a string, take the last char and return a new string
		 * with the last char added at the front and back, so "cat" yields
		 * "tcatt". The original string will be length 1 or more
		 * 
		 * 
		 */
		
		System.out.println(backAround("cat"));

	}

	public static String backAround(String str) {
		

		int size = str.length();

		char a = str.charAt(size - 1);

		str = a + str +a;
		return str;

	}
}
