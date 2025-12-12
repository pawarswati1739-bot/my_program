package com.Dec_4;

public class StudentMangment {
	String name;
	int rollNo;
	String branch;
	String faclty;
	String subjects;

	void stud_info(String name, int rollNo, String branch, String faclty, String subjects) {
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.faclty = faclty;
		this.subjects = subjects;
		this.dispaly();
	}
	
	void dispaly() {
		System.out.println("Name ="+name);
		System.out.println("RollNo ="+rollNo);
		System.out.println("Branch ="+branch);
		System.out.println("Faclty ="+faclty);
		System.out.println("Subjects ="+subjects);
	}

}
