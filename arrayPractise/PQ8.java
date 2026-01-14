package com.arrayPractise;

import java.util.Scanner;

public class PQ8 {
	public static void main(String[] args) {
		int[] no = {10, 20, 30, 40, 50};
		int num =20;
//      Scanner sc = new Scanner(System.in);
       // int num = sc.nextInt();
        boolean flag = false;
        
        for (int i = 0; i < no.length; i++) {
            if (no[i] == num) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
