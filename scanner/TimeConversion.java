package com.scanner;

import java.util.Scanner;

public class TimeConversion {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter a time t =");
	int  t = sc.nextInt();
	int sec= t *60;
	system.out.println("Enter a time in sec =");
	int second=sc.nextInt();
	int min= second / 60;
	System.out.println("Time in min to sec ="+ sec);
}
}

