package com.school;

public class Teacher extends School {
	int Id;
	String subject;

	void showTeacher() {
		System.out.println("   ");
		System.out.println("Teacher ID: " + Id);
		System.out.println("Subject: " + subject);
	}

	public static void main(String[] args) {
		School s;
		s = new School();
		s.schoolName = "NESB,Belanki";
		s.board = "State Bord";
		s.showSchool();

		Teacher t;
		t = new Teacher();
		t.Id = 123;
		t.subject = "Math";
		t.showTeacher();
	}

}
