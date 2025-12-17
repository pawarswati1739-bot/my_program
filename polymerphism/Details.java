package com.polymerphism;

public class Details {
    void details(String name) {
        System.out.println("Name: " + name);
    }

    void details(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Details d = new Details() ;
        d.details("Swati");
        d.details("Swati", 07);
    }

}
