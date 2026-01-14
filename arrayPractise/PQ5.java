package com.arrayPractise;

public class PQ5 {
	public static void main(String[] args) {
        int[] no = {67, 2, 65, 49, 35};
        int max = no[0];

        for (int i = 1; i < no.length; i++) {
            if (no[i] > max) {
                max = no[i];
            }
        }

        System.out.println("Largest Number = " + max);
    }
}
