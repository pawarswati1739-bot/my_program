package com.jbk1;
//Q3....Exception
// throw and throws
public class Voting {

	public static void age(int age) throws Exception{
		if(age<18) {
		throw new Exception("Not eligible");
	}else {
		System.out.println("Eligibale");
	}
	}
	public static void main (String[]args) {
		try {
			age( 8);
			
		}catch(Exception e) {
		System.out.println(e.getMessage());	
		}
	}


}