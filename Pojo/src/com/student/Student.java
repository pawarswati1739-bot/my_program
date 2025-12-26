package com.student;

public class Student {
public String name;
public int rollNo;
public String stream;

public Student() {
	
}
public Student(String name, int rollNo, String stream) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.stream = stream;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}


}
