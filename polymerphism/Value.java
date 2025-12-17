package com.polymerphism;

import java.util.Scanner;

public class Value {
	 void display(int a) {
	        System.out.println("Integer value: " + a);
	    }

	    void display(String s) {
	        System.out.println("String value: " + s);
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	 Value v= new Value();
	    	 System.out.print("Enter an integer: ");
	         int a = sc.nextInt();
	         
	         System.out.print("Enter a string: ");
	         sc.nextLine(); // clear buffer
	         String str = sc.nextLine();


	        
	        v.display(a);
	        v.display(str);
	    }
}
