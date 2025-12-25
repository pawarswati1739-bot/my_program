package com.access;

public class Main {
	  public static void main(String[] args) {
Main m= new Main();
	        // Interface reference
	        Login l;
	       	        l = new Student("Swati", 101, 12345);
	        l.login("swati", "123");

	        // Abstract class reference
	        User u;
	        u = new Student("Amit", 102, 54321);
	        
	        u.accessUser();

	        // Abstract + Interface reference
	        Staff s;
	        s = new Admin("Admin1", 1, 99999);
	        
	        s.Work();
	        
	        
	        
	    }
}
