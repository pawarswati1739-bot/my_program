package com.college;

public class Student extends College {

	@Override
	void coll_Name() {
		System.out.println("SMDBSM, miraj");
		System.out.println("Student Name = Swati Pawar");
	}

	@Override
	void coll_ID() {

		System.out.println("College Id caerd must be Complasry.");
		System.out.println("Roll No = 90");
	}

	public static void main(String[] args) {
		College c;
		c = new College();
		c.coll_Name();
		c.coll_ID();
		c = new Student();
		c.coll_Name();
		c.coll_ID();

	}
}
