package com.scanner;

import java.util.Scanner;

public class LargestNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter no a = ");
	 int a = sc.nextInt();
	 System.out.println("Enter No b = ");
	  int b = sc.nextInt();
	  System.out.println("Enter No c = ");
	  int c = sc.nextInt();
	  
	  int largestNo = (a>b?a:c) |(b>c?b:c);
	  
		System.out.println(largestNo);	 
}
}
