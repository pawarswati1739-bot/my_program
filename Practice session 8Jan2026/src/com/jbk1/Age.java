package com.jbk1;
//Exception
//Q2
public class Age {
	class AgeTest {
		public static void main(String[] args) {
			int age = 15;

			try {
				if (age < 18) {
					throw new InvalidAgeException("Age must be 18 or above");
				}
				System.out.println("Valid Age");
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}