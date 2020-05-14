package com.CodingBat;

import java.util.Scanner;

public class Solution5 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(startHi(A));

	}

	public static boolean startHi(String str) {

		return str.startsWith("H") || str.startsWith("h")? true : false;

	}

}
