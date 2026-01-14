package com.arrayPractise;

public class PQ6 {
	public static void main(String[] args) {
        int[] no = {10, 0, 9, 49, 25};
        int min = no[0];

        for (int i = 1; i < no.length; i++) {
            if (no[i] < min) {
                min = no[i];
            }
        }

        System.out.println("Smallest Number = " + min);
    }
}
