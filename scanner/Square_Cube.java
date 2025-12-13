package com.scanner;

import java.util.Scanner;

public class Square_Cube {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  ano n =");
        int n = sc.nextInt();
        System.out.println("Square = " + (n * n));
        System.out.println("Cube = " + (n * n * n));
    }
}
