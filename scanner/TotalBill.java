package com.scanner;

import java.util.Scanner;

public class TotalBill {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a price = ");
        float price = sc.nextFloat();
        System.out.println("enter a quantity = ");
        int quantity = sc.nextInt();
        System.out.println("Total Bill = " + (price * quantity));
	} 
}
