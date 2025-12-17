package com.polymerphism;

public class Area {
	void area(int r) {
		System.out.println("Area of Circle =" + 3.14 * r * r);
	}

	void area(int l, int b) {
		System.out.println("Area of Rectangle =" + l * b);
	}

	public static void main(String[] args) {
		Area a = new Area();
		a.area(7);
		a.area(5, 8);
	}
}
