package com.Q4;

public class Car extends Vehicle{
public void drive() {
	System.out.println("Car is driving");
}
public static void main(String[] args) {
	Car c =new Car();
	c.start();
	c.drive();
}
}
