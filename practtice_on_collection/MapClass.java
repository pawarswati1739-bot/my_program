package com.practtice_on_collection;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
//Q13
	//Create a HashMap and store Roll No as key and Name as value.
	public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<Integer, String>();
map.put(1, "Anjali");
map.put(2, "Anuja");
map.put(3, "Veeshanvi");
map.put(4, "Sujata");
map.put(5, "Aarati");
map.put(6, "Gita");
map.put(7, "Samrudhi");

System.out.println(map); 

System.out.println("    ");
System.err.println("<---------------------->");

//Q15
//Display all key–value pairs using entrySet().
for(Map.Entry<Integer,String> e: map.entrySet() ) {
	System.out.println(e.getKey()+" = "+ e.getValue());
}


System.out.println("    ");
System.err.println("<---------------------->");
//Q16
//Retrieve a value using a key from Map.

map.get(1);
System.out.println(map.get(1));

System.out.println("    ");
System.err.println("<---------------------->");

//Q17
//Check whether a key exists in Map
System.out.println(map.containsKey(map));
System.out.println(map.containsKey(4));

System.out.println("    ");
System.err.println("<---------------------->");

//Q18
//Check whether a Valu exists in Map.
System.out.println(map.containsValue(map));
System.out.println(map.containsValue(4));

System.out.println("    ");
System.err.println("<---------------------->");

//Q19
//Size of map
System.out.println(map.size());

System.out.println("    ");
System.err.println("<---------------------->");

//Q20
map.remove(5);
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
	}
}



