package com.Collection;

import java.util.HashMap;

public class Application {

	public static void main(String args[]) {

		/***
		 * Hash Map Every row of data is considered as an entry which has key
		 * Value
		 * There is no order in insertion
		 * 
		 * To preserve order of insertion use Linked Hash map
		 * Tree Map can be used to sort keys in alphabetical order
		 * You can not store duplicates in Map
		 */

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "Rudrika");
		hm.put("2", "Puru");
		hm.put("3", "Chandrika");
		hm.put("4", "Shivam");

		/************* To print keys in a map *************************/

		for (String word : hm.keySet()) {
			System.out.println(hm.get(word));
		}
		
		/****** To iterate over both  key and value that is entry set*****/
		
		
	}

}
