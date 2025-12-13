package com.scanner;

import java.util.Scanner;

public class CheakNo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no n=");
        int n = sc.nextInt();
        if(n > 0)
            System.out.println("Positive");
        else if(n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

}
