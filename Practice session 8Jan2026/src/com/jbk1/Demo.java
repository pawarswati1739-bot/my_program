package com.jbk1;
//Q4...Exception

// multipale catch 
public class Demo {
	 public static void main(String[] args) {
	        try {
	            int arr[] = new int[5];
	            arr[10] = 50;
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Error");
	        } catch (Exception e) {
	            System.out.println("General Exception");
	        }
	    }
}
