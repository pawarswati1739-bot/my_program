package com.practise_array;
//odd no.
public class Q1 {
	public static void main(String[] args) {
        int[] num = {18, 91, 302, 53, 54};
        int no = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                no++;
            }
        }

        System.out.println("Odd Numbers  = " + no);
    }
}
