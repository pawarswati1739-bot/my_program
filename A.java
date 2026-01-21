package com.collection;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class A {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(34);
		list.add(78);
		list.add(45);
		list.add(10);
		list.add(10);

		
		System.out.println(list);

		//Q2
		// add , remove, update
		list.add(100);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(3, 84);
		System.out.println(list);
//Q3
		// size of list and print 1st ,last element
		list.size();
		System.out.println(list);
		list.getFirst();
		System.out.println(list);
		list.get(list.size()-1);
		System.err.println(list);
		//Q4
		//given no. is exist or not
		if (list.contains(12)) {
			System.out.println("Exist");
		} else {
			System.out.println("not exist");
		}
		//Q5
		//foreach loop
		List<Integer> l=new ArrayList<>(12);
		for(int i:l) {
			System.out.println(i);
		}
		
		//Q6
		//sorting accending order
		list.sort(null);
		System.out.println(list);
//Q7
//remove duplicate
		ArrayList<Serializable> list1 = new ArrayList<>();
		list1.add(22);
		list1.add(34);
		list1.add(7);
		list1.add(40);
		list1.add(18);
		list1.add(10);
		{
			list.sort(null);
			list1.sort(null);
			if (list.parallelStream() != null) {
				System.out.println("Duplicate");
			} else
				System.out.println("Not duplicate");
		}
		
		System.out.println(list1);
		list1.add(list);
		System.out.println(list1);
		//Q8reverse element
		List<Integer> list2= new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		Collections.reverse(list2);
		System.out.println(list2);
		
		//Q9
		//copy all element from one list to another list
		
		List<String> list3=Arrays.asList("Swati" ,"Jyoti","Sakshi");
		List<List> list4=new ArrayList( list3);
		System.out.println(list4);
		
		//Q10
		//conversion of list into Array
		
		List<Integer> list5=Arrays.asList(10,20,30,40,50);
		
		Integer[] arr=list.toArray(new Integer[0]);
		for(int i:arr) {
			System.out.println(i);
		}
		
		
	}

}
