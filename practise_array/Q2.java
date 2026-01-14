package com.practise_array;
//only even
public class Q2 {
	 public static void main(String[] args) {
	        int[] num = {46,47,48,59,309,49};

	        for (int i = 0; i < num.length; i++) {
	            if (num[i] % 2 == 0) {
	                System.out.println(num[i]);
	            }
	        }
	    }
}
