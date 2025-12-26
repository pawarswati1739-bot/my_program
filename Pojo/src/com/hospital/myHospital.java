package com.hospital;

import java.util.Scanner;

public class myHospital {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Hospital h= new Hospital();
	System.out.println("enter hospital name :");
	h.setHos_Name(sc.nextLine());
	System.out.println("Enter total hospital staff :");
	h.setTotalStaff(sc.nextInt());
	System.out.println("Hospital Name : "+ h.getHos_Name());
	System.out.println("Total Staff : "+h.getTotalStaff());

	
}
}
