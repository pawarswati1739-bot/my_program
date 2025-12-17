package com.polymerphism;

import java.util.Scanner;

public class Temperature {
    void convert(double celsius) {
        double f = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + f);
    }

    void convert(int fahrenheit) {
        double c = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius = " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperature t = new Temperature();

        System.out.print("Enter Celsius value: ");
        double c = sc.nextDouble();
        t.convert(c);

        System.out.print("Enter Fahrenheit value: ");
        int f = sc.nextInt();
        t.convert(f);
    }

}
