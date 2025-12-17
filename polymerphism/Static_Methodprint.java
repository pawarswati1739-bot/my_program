package com.polymerphism;

public class Static_Methodprint {
	static void print(int a) {
        System.out.println(a);
    }

    static void print(int a, int b) {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
    	Static_Methodprint s =new Static_Methodprint();
        s.print(10);
        s.print(10, 20);
    }
}
