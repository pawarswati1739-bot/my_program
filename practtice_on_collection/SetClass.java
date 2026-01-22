package com.practtice_on_collection;

import java.util.HashSet;

public class SetClass {
public static void main(String[] args) {
	
	//Q7
	//Create a HashSet and add 5 string values
	HashSet<String> set=new HashSet<String>();
	set.add("Swati");
	set.add("Jyoti");
	set.add("Sakshi");
	set.add("Durga");
	set.add("Yogita");
	System.out.println(set);
	
	System.out.println("    ");
	System.err.println("<---------------------->");
	//Q8
	//Try to add duplicate elements in a Set
	set.add("Shriraj");
	set.add("Shriraj");
	System.out.println(set);
	
	System.out.println("    ");
	System.err.println("<---------------------->");
	
	//Q9
	//Display all elements of a Set using for-each loop.
	for (String str : set) {
		System.err.println(str);
	}
	
	System.out.println("    ");
	System.err.println("<---------------------->");
	
	//Q10
	//Check whether a specific element exists in a Set
	String name="Shambhu";
	if(set.contains(name)) {
		System.out.println(name +"  Exist");
	}else {
		System.out.println(name +"  Not Exit");
	}
	
	System.out.println("    ");
	System.err.println("<---------------------->");
	
	
	//Q11
	//Remove an element from a Set.
	set.remove("Swati");
	System.out.println(set);
	
	System.out.println("    ");
	System.err.println("<---------------------->");
	
	//Q12
	// Find total number of elements in a Set.
	set.size();
	System.out.println(set.size());
	
	
	
	
	
}
}
