package com.scanner;

import java.util.Scanner;

public class Area_Rec {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length");
        int l = sc.nextInt();
        
        System.out.println("Enter a width");
        int w = sc.nextInt();
        
        System.out.println("Area of rectangle = " + (l * w));
    }
}

