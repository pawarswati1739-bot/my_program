package com.scanner;

import java.util.Scanner;

public class Employee_Details {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a name :");
	        String name = sc.next();
	        
	        System.out.println("enter  a emp ID :");
	        int id = sc.nextInt();
	        
	        System.out.println("enter a emp salary");
	        double salary = sc.nextDouble();

	        System.out.println("Employee Name = "+name);
	        System.out.println("Employee ID ="+id);
	        System.out.println("Employee Salary ="+salary);
	    }
}
