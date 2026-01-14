package com.arrayPractise;

public class PQ10 {
	public static void main(String[] args) {
        int[] num1 = {10, 20, 36, 67, 43};
        int[] num2 = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
           num2[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}
