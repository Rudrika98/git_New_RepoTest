package com.Collection;

import java.util.HashSet;

public class Solution1 {

	/******
	 * This class demonstrates the use of Set in Collection
	 * 
	 * In Array List and Linked List we can add duplicateentries but in Set
	 * duplicate entries are prohibited. Set is useful for unique entries and no
	 * order is maintained in Set To maintain order use LinkedHashSet. Hash codes are used to define 
	 * uniqueness in Hash Set
	 * 
	 * 
	 * Runnable class in java is
	 * 
	 * Runnable Interface should be implemented by any class whose instances are
	 * intended to be executed by a thread. The class must define method of no
	 * arguments called run.
	 *
	 * 
	 */

	public static void main(String args[]) {

		HashSet<String> val = new HashSet<String>();
		// Random was printed as third element and it was printed only once
		val.add("Random");
		val.add("Rudrika");
		val.add("Puru");
		val.add("Shivam");
		val.add("Random");

		for (String str : val) {
			System.out.println(str);
		}

		System.out.println("/**************************Linked Hash Set************************/");

		HashSet<String> vals = new HashSet<String>();
		// Random was printed as first element and it was printed only once
		vals.add("Random");
		vals.add("Rudrika");
		vals.add("Puru");
		vals.add("Shivam");
		vals.add("Random");

		for (String str : vals) {
			System.out.println(str);
		}

		System.out.println("/************************Using User Defined Data Type************************");

		HashSet<Vehicle> value = new HashSet<Vehicle>();
		// Random was printed as first element and it was printed only once

		Vehicle v1 = new Vehicle("Honda", "accord", 12000, false);
		Vehicle v51 = new Vehicle("Honda", "accord", 12000, false);
		Vehicle v2 = new Vehicle("Jeep", "Wrangler", 25000, true);
		Vehicle v3 = new Vehicle("Toyota", "Camery", 12000, false);
		value.add(new Vehicle("Honda", "accord", 13000, true));
		value.add(v1);
		value.add(v2);
		value.add(v3);
		value.add(v51);
		
		System.out.println(v51.hashCode());
		System.out.println(v1.hashCode());

		for (Vehicle veh : value){
			System.out.println(v51);
		}
	}

}
