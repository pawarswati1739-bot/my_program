package com.hospital;

public class Doctor extends Hospital {
@Override
void Name() {
	System.out.println("Doctor Name = Dr.Maya Shinde");
	}
@Override
	void address() {
		System.out.println("Sangli....");
	}
public static void main(String[] args) {
	Hospital h;
	h= new Hospital();
	h.Name();
	h.address();
	h=new Doctor();
	h.Name();
	h.address();
}
}
