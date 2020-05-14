package com.Collection;
import java.util.ArrayList;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/******
		 * Advantage of arraylist over arrays is
		 * Arraylist is resizeable
		 * You can add any data type into arraylist: int,string, char
		 * 
		 * Disadvantage of arraylist
		 * You need to know data type at every element like you need to know prior that element has string datatype
		 *  not user friendly
		 */
		
		
		ArrayList words = new ArrayList();
		words.add("Hello");
		words.add("There");
		words.add(10);
		words.add(12.00);
		words.add("H");
		
		String item = (String) words.get(0); // Casting needs to be done in ArrayList disadvantage of ArrayList
		Object item2 = words.get(1);
		
		System.out.println(item+item2.toString());
		
		
		/*****
		 * To overcome disadvantage use following 
		 * 
		 */

	}

}
