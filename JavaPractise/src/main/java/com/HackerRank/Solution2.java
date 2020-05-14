package com.HackerRank;

import java.util.Scanner;

public class Solution2 {

	 static boolean flag = true;
	 static int B,H;
	static {
		try {
			
			
			Scanner sc = new Scanner(System.in);
			B = sc.nextInt();
			sc.nextLine();
			H = sc.nextInt();
			sc.close();

			if ((B <= 0 || H <= 0) || (B >= 100 || H >= 100)) {
				flag = false;
				System.out.println("java.lang.Exception: Breadth and height must be positive");
//				throw new Exception("java.lang.Exception: Breadth and height must be positive");
			} else {
				flag = true;

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {

		/****
		 * 
		 * Category Java Static block Initializer
		 * 
		 * 
		 * 
		 */

		
		if (Solution2.flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
