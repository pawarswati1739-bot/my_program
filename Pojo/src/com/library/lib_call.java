package com.library;

import java.util.Scanner;

public class lib_call {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	Library l= new Library();
	
	System.out.println("Library Information ....");
	
	
	System.out.println("Enter Library name : ");
	l.setLibraryName(sc.nextLine());
	
	System.out.println("Enter a Lib. Id :");
	l.setLibID(sc.nextInt());
	
	System.out.println("Enter a Lib Address :");
	l.setLibAddress(sc.nextLine());
	
	System.out.println("Library Name : "+l.getLibraryName());
	System.out.println("Library ID : "+ l.getLibID());
	System.out.println("Library Address :  "+l.getLibAddress());
}
}
