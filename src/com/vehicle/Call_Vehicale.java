package com.vehicle;

public class Call_Vehicale {
	public static void main(String[] args) {

		Vehicle v;
		v = new Car();
		v.type();
		System.out.println("  ");
		v=new Bike();
		v.type();

	}
}