package com.arrayPractise_1D;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array1D {
public static void main(String[] args) {
	
	//Q1 declare and initialize the integer
	int[] arr= {10,12,33,45,32,33};
	
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	// Q3find the length
	System.out.println(arr.length);
	
	//Q4 sum of all element

	int sum=Arrays.stream(arr).sum();
	System.out.println(sum);
	
	// Q5 average 
	int average=(int) Arrays.stream(arr).average().getAsDouble();
	System.out.println(average);
	
	//Q6 max. element 
	System.out.println("Maximum = " + arr[arr.length - 1]);
	
	//Q7 min. element
	System.out.println("Minimum = " + arr[0]);
	
	//Q8 search element 
	 int index = Arrays.binarySearch(arr, 33);
     System.out.println( index >= 0 );
     
     //Q9 even odd
     long even = Arrays.stream(arr).filter(n -> n % 2 == 0).count();
     long odd = Arrays.stream(arr).filter(n -> n % 2 != 0).count();
     System.out.println("Even = " + even);
     System.out.println("Odd = " + odd);
     
     //Q10 copy array
     
     int[] b = Arrays.copyOf(arr, arr.length);
     System.out.println(Arrays.toString(b));
     
     //Q11 reverse array
     
     Collections.reverse(Arrays.asList(arr));
     System.out.println(Arrays.toString(arr));
     
     //Q12 ascending sorting
     System.out.println(Arrays.toString(arr));
 
     //Q13 descending sorting array element
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
     
     //Q14 find Duplicate value
     

     Set<Integer> set = new HashSet<>();
     for (int n : arr)
         if (!set.add(n))
             System.out.println("Duplicate: " + n);
     
     //Q15 remove Duplicate
     {  Integer[] a= {1,3,4,5,7};

     Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(a));
     System.out.println(set1);}
     
     // Q17 second largest
     System.out.println("Second Largest = " + arr[arr.length - 2]);
     
     //Q18 Second smallest no
     System.out.println("Second Smallest = " + arr[1]);
     
     // Q19 merge two arrays
     {int[] a = {1, 2};
     int[] b1 = {3, 4};

     int[] c = Arrays.copyOf(a, a.length + b1.length);
     System.arraycopy(b1, 0, c, a.length, b1.length);

     System.out.println(Arrays.toString(c));
 }

     // Q20 Palindrome no
     {  
     int[] a = {1, 2, 3, 2, 1};
     int[] c = Arrays.copyOf(a, a.length);

     Arrays.sort(a);
     Arrays.sort(b);

     System.out.println(Arrays.equals(a, b) ? "Palindrome" : "Not Palindrome");
 }
}
}

