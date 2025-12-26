package com.student;

import java.util.Scanner;//tin p  online promotion 

public class Stud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s = new Student();

		System.err.println("Student Information ....");

		System.out.println("Enter Student Name ");
		s.setName(sc.nextLine());

		System.out.println("Enter roll no. : ");
		s.setRollNo(sc.nextInt());
		
		
		System.out.println("Enter Stream ");
		s.setStream(sc.next());

		System.out.println("Stubent Name =  " + s.getName());

		System.out.println("Student Roll No =  " + s.getRollNo());

		System.out.println("Strem : " + s.getStream());

	}
}
