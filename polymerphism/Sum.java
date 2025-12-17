package com.polymerphism;

import java.util.Scanner;

public class Sum {
	int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
        Sum s = new Sum();
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum (int): " + s.sum(x, y));

        System.out.print("Enter two float values: ");
        float p = sc.nextFloat();
        float q = sc.nextFloat();
        System.out.println("Sum (float): " + s.sum(p, q));
    }
}
