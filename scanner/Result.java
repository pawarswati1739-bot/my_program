package com.scanner;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks =");
		float marks = sc.nextFloat();
		if (marks >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
