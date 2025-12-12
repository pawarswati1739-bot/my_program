package com.vehicale;

public class Bike extends Vehicale {
	String name;

    Bike(String brand,String name ) {
        super(brand);
        this.name= name;
    }

    void showBike() {
        System.out.println("Bike name : " + name);
    }
}
