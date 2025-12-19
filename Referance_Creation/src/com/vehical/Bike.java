package com.vehical;

public class Bike extends Vehicle {
@Override
void brand() {
	System.err.println("------->  Bike <--------");
	System.out.println("Brand : YAMHA Y25");
}
@Override
	void speed() {
		System.out.println("Speed: 150km/H");
	}
public static void main(String[] args) {
	Vehicle v;
	v=new Vehicle();
	v.brand();
	v.speed();
	v=new Car();
	v.brand();
	v.speed();
	v=new Bike();
	v.brand();
	v.speed();

}
}
