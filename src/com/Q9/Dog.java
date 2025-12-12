package com.Q9;

public class Dog extends Animal{
public void brak() {
	System.out.println("Dog is braking...");
}
public static void main(String[] args) {
	Dog d=new Dog();
	d.live();
	d.eat();
	d.brak();
}
}
