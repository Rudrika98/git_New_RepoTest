import java.util.ArrayList;
import java.util.LinkedList;

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
		 * you can not put primitive data types in ArrayList like
		 * ArrayList<int> is wrong
		 */
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rudrika");
		al.add("Puru");
		
		
		/****
		 * Difference between array list and linked list
		 * It works same but only difference is underlining data structure
		 * Array list uses array for implementation
		 * Linked List uses node object and implements doubly linked list
		 * 
		 * Linked List is bunch of nodes linked together it is faster for manipulating data
		 * Array List is resizeable array it is faster for retrieving data but slower for manipulation
		 * 
		 *  To retrieve data from linked list it would have to be traversed completely to find particular element
		 * 
		 * */
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(12);
		 

	}

}
