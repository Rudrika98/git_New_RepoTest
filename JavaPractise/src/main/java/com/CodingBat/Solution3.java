package com.CodingBat;

public class Solution3 {
	
	/****
	 * 
	 * Given a non-empty string and an int n, return a new 
	 * string where the char at index n has been removed. 
	 * The value of n will be a valid index of a char in the original 
	 * string (i.e. n will be in the range 0..str.length()-1 inclusive)
	 * 
	 * @param args
	 */

	public static void main(String args[]) {

		System.out.println(missingChar("Rudrika",2));
	}

	public static String missingChar(String str, int n) {
		String front = str.substring(0, n);

		String back = str.substring(n + 1, str.length());

		return front + back;
	}

}
