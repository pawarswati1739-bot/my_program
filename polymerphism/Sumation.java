package com.polymerphism;

public class Sumation {
    void show(int a, String b) {
        System.out.println(a + " " + b);
    }

    void show(String b, int a) {
        System.out.println(b + " " + a);
    }

	public static void main(String[] args) {
		Sumation sum =new Sumation();
		sum.show(25, "JDk");
		sum.show("Jdk", 25);
	}
}
