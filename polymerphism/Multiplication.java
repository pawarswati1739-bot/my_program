package com.polymerphism;

public class Multiplication {
int multiply(int a, int b) {
	System.out.println("a*b ="+(a*b));
	return a*b;
}
int multiply(double a, double b ,double c) {
	System.out.println("a*b*c = "+ (a*b*c));
	return (int) (a*b*c);
}
public static void main(String[] args) {
	Multiplication m =new Multiplication();
	m.multiply(3, 8);
	m.multiply(.7, 10, 5.5);
}
}
