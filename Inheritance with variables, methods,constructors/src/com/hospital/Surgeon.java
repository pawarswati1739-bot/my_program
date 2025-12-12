package com.hospital;

public class Surgeon extends  Doctor{
	String surgeryType = "Heart Surgery";
	public static void main(String[] args) {
		Surgeon s =new Surgeon();
		System.out.println("Staff Ditales");

		System.out.println("Staff :"+s.name);
		System.out.println("Staff ID =" + s.staffId);

		System.out.println("Doctor of "+ s.specialization);
System.out.println("Surgen type = "+s.surgeryType);
	}
}
