package com.practtice_on_collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		// Q1
		// Create an ArrayList and add 5 integers
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);

		System.out.println("    ");
		System.err.println("<---------------------->");
		// Q2
		// display all elements of List using for-each loop
		List<String> list = new ArrayList();
		list.add("Swati");
		list.add("Jyoti");
		list.add("Sakshi");
		list.add("Komal");
		list.add("Shriraj");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("    ");
		System.err.println("<---------------------->");

		// Q3
		// Add an element at a specific index in an ArrayList
		a.add(2, 100);
		System.out.println(a);

		System.out.println("    ");
		System.err.println("<---------------------->");

		// Q4
		// Remove an element from a List using index
//		{	list.remove(0);
//		System.out.println(list);
//
//		System.out.println("    ");
//		System.err.println("<---------------------->");}

		// Q5
		// size of a List
		list.size();
		System.out.println(list);
		a.size();
		System.out.println("ArrayList = " + a);
		System.out.println("    ");
		System.err.println("<---------------------->");

//Q6
		// Check whether a List is empty or not
		list.isEmpty();
		System.out.println(list);
		a.isEmpty();
		System.out.println("ArrayList = " + a);
		System.out.println("    ");
		System.err.println("<---------------------->");

		//Q7
		//List using get() method
		list.get(0);
		System.out.println(list.get(0));
		list.getFirst();
		System.out.println(list.getFirst());
		list.getLast();
		System.out.println(list.getLast());

		a.get(3);
		System.out.println("ArrayList = " + a.get(3));
		a.getFirst();
		System.out.println("ArrayList = " + a.getFirst());
		a.getLast();
		System.out.println("ArrayList = " + a.getLast());

	}
}
