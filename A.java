package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A {
public static void main(String[] args) {
	ArrayList<String> list1= new ArrayList<>();
	list1.add("Swati");
	list1.add("ID");
	list1.add("Roll no");
	
	
	ArrayList<Integer> list2= new ArrayList<Integer>();
	list2.add(708);
	list2.add(60);
	list2.add(2384);
	
	Map<String,Integer> map =new HashMap<String, Integer>();
	for(int i=0; i<list1.size(); i++) {
		map.put(list1.get(i), list2.get(i));
	}
	for(Map.Entry<String,Integer> e: map.entrySet() ) {
		System.out.println(e.getKey()+" = "+ e.getValue());
	}
}
}
