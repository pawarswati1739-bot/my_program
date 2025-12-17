package com.polymerphism;

public class Student {

	int id;
	String name;

	Student() {
		id = 0;
		name = "Default";
	}

	Student(int id) {
		this.id = id;
	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		new Student().display();
		new Student(101).display();
		new Student(102, "Swati").display();
	}
}