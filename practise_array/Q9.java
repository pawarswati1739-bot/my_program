package com.practise_array;
//prime no cod
public class Q9 {
	public static void main(String[] args) {

        int[] number = {2, 3, 4, 5, 6, 7, 8, 9, 11};

        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is Prime");
            }
        }
}
}