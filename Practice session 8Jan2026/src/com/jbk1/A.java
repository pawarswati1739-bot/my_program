package com.jbk1;
//Exception
//Q1 ArithmeticException
public class A {
public static void main(String[] args) {
	try {
		int a=10, b=0;
		int c=a/b;
		System.out.println(c);
		
	} catch ( ArithmeticException e) {
		System.out.println("Not divisible by Zero ");
	}
}
}
