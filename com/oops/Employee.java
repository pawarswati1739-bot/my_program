package com.oops;

public class Employee {
	 int id;
	    String name;
	 // HAS-A relationship
	    Address address;   
	    
	    
	    Employee(int id, String name, Address address) {
	        this.id = id;
	        this.name = name;
	        this.address = address;
	    }

	    
	    void display() {
	        System.out.println(id + " " + name + " " + address.city);
	    }
}
