package com.scanner;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a celsius");
        float c = sc.nextFloat();
        float f = (c * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + f);
    }
}
