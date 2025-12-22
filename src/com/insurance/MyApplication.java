package com.insurance;

public class MyApplication {
	public static void main(String[] args) {
		Insurance i;
		i = new Life();
		i.claim();
		System.out.println();
		i = new Vehicle_Insurance();
		i.claim();
	}
}
