package com.HackerRank;

import java.util.Scanner;

public class Solution {

	/********
	 * Category Java Data Types author - rudr9876
	 * gitPractise learning
	 */

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				//8-bit signed two's complement integer.
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				// 16-bit signed two's complement integer.
				// short has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
				if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
					System.out.println("* short");
				// 32-bit signed two's complement integer
				// int data type has a minimum value of -231 and a maximum value of 231-1
				if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
					System.out.println("* int");
				// 64-bit two's complement intege
				// long data type has a minimum value of -263 and a maximum value of 263-1
				if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
