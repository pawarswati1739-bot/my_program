package com.scanner;

import java.util.Scanner;

public class Triangle_perimeter {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No a=");
        int a = sc.nextInt();
        
        System.out.println("Enter No b=");
        int b = sc.nextInt();
        
        System.out.println("Enter No c=");
        int c = sc.nextInt();
        System.out.println("Perimeter = " + (a + b + c));
    }
}
