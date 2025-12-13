package com.scanner;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter a full name :");
		String name = sc.nextLine();
		
		System.out.println("Enter a Age :");
		int age = sc.nextInt();
		
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
	}

}
}
