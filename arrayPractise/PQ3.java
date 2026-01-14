package com.arrayPractise;

public class PQ3 {
	public static void main(String[] args) {
        int[] arr = {58, 67, 75, 20, 14};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
