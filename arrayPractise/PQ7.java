package com.arrayPractise;

public class PQ7 {
	public static void main(String[] args) {
        int[] no = {10, 21, 32, 43, 54};
        int num = 0;

        for (int i = 0; i < no.length; i++) {
            if (no[i] % 2 == 0) {
                num++;
            }
        }

        System.out.println("Even Numbers  = " + num);
    }
}
