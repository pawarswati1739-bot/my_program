package com.practise_array;
//count positive numbers

public class Q7 {
	 public static void main(String[] args) {
	        int[] num= {10, -5, 20, -3, 15};
	        int count = 0;

	        for (int i = 0; i < num.length; i++) {
	            if (num[i] > 0) {
	                count++;
	            }
	        }

	        System.out.println("Count Positive Numbers  = " + count);
	    }
}
