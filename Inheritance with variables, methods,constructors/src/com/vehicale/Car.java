package com.vehicale;

public class Car  extends Vehicale {
   String modal;

    Car(String brand, String model) {
        super(brand);
        this.modal =model;
    }

    void showCar() {
        System.out.println("Car model: " + modal);
    }
}
 