package com.scanner;

import java.util.Scanner;

public class Mark_percentage {
	public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++) {
        	System.out.println("enter a marks");
            int a = sc.nextInt();
            System.out.println("enter a marks");
            int b= sc.nextInt();
            System.out.println("enter a marks");
            int c= sc.nextInt();
            System.out.println("enter a marks");
           int d= sc.nextInt();
            System.out.println("enter a marks");
            int e= sc.nextInt();
           int total =a+b+c+d+e;
        
        float percentage = (total /500)*100f;
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
    }

	}
}
