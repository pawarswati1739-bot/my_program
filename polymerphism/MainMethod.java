package com.polymerphism;

public class MainMethod {
	 public static void main(String[] args) {
	        System.out.println("Main method");
	        main(10);
	    }

	    public static void main(int a) {
	        System.out.println("Overloaded main: " + a);
	    }
	    
}
