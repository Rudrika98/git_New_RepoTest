package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class lesson2 {

	public static void main(String args[]) {
		// Ctrl+Shift+O Automatically importingpackages
		// Ctrl + T to bring up class hierarchy

		ArrayList<String> al = new ArrayList<String>();
		al.add("Cow");
		al.add("Buffalo");
		al.add("Deer");
		al.add("Lion");
		al.add("Cat");

		/*****
		 * Two ways to traverse list traditional for loop for each loop
		 */
		System.out.println(
				"/**********************First Loop using traditional for loop*********************************/");
		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}

		System.out.println("/*********************Second Loop using for each loop *****************************/");
		for (String val : al) {

			System.out.println(val);
		}

		System.out.println("/**************Third loop using Vehicle Class*************************************/");
		ArrayList<Vehicle> veh = new ArrayList<Vehicle>();
		veh.add(new Vehicle("Honda", "accord", 12000, false));
		veh.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		veh.add(new Vehicle("Toyota", "Camery", 12000, false));

		for (Vehicle vehi : veh) {
			System.out.println(vehi.getMake());
			System.out.println(vehi.getModel());
			System.out.println(vehi.getPrice());
			System.out.println(vehi.isFourWDrive());
			System.out.println(vehi);
		}

		System.out.println("/***************************Printing Using function******************************/");
		printElements(veh);
		printElements(al);
		
	}
	

	public static void printElements(List someList) {
		
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}


	}
}
