package com.scanner;

import java.util.Scanner;

public class simple_Interest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  a principal =");
		int P = sc.nextInt();
		System.out.println("enter a Rate of intrest =");
		float R = sc.nextFloat();
		System.out.println("Enter time duration =");
		int T = sc.nextInt();
		System.out.println("Simple Interst ="+ P*R*T/100);

	}
}
