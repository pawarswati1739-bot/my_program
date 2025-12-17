package com.polymerphism;

public class Square_Cube {
	void calculate(int a) {
		System.out.println("Square: " + (a * a));
	}

	void calculate(int a, int b) {
		System.out.println("Cube: " + (a * a * a));
	}

	public static void main(String[] args) {
		Square_Cube s_c = new Square_Cube();

		s_c.calculate(5);
		s_c.calculate(5, 1);
	}
}
