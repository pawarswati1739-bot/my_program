package com.oops;

public class Aggrigration {
	public static void main(String[] args) {
		
		 Address a = new Address("Pune");
     Employee emp = new Employee(1053, "Ravi", a);
     emp.display();
 }
}
