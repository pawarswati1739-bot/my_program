package com.practise_array;
//second largest no
public class Q4 {
	public static void main(String[] args) {
        int[] no = {10, 25, 5, 40, 15};
        int largest = no[0];
        int secondLargest = no[0];

        for (int i = 0; i < no.length; i++) {
            if (no[i] > largest) {
                secondLargest = largest;
                largest = no[i];
            }
        }

        System.out.println("Second Largest No = " + secondLargest);
    }
}
