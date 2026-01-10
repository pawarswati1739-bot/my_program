package com.oops;

public class Student {
	 int id;
	    String name;

	    Student() {
	        id = 0;
	        name = "Unknown";
	    }

	    Student(int i, String n) {
	        id = i;
	        name = n;
	    }

	    void display() {
	        System.out.println(id + " " + name);
	    }
}
