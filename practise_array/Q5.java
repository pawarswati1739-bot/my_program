package com.practise_array;

public class Q5 {
	 public static void main(String[] args) {
	        int[] num= {80, -51, 2, -31, 15};

	        for (int i = 0; i < num.length; i++) {
	            if (num[i] < 0) {
	                num[i] = 0;
	            }
	        }

	        for (int i = 0; i < num.length; i++) {
	            System.out.println(num[i]);
	        }
	    }
}
