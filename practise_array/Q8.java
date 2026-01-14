package com.practise_array;

public class Q8 {

	public static void main(String[] args) {
		int[] arr = { 16, 35, 38, 470, 87 };

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}