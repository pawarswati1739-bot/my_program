package com.pojo;

public class Employee {
private int Id;
private String name;
private String EmailId;
private String city;
private String Department;
private String PostName;
private double salary;
private String DOB;
private String DOJ;
private String mode;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getPostName() {
	return PostName;
}
public void setPostName(String postName) {
	PostName = postName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public String getDOJ() {
	return DOJ;
}
public void setDOJ(String dOJ) {
	DOJ = dOJ;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String emailId, String city, String department, String postName, double salary,
		String dOB, String dOJ, String mode) {
	super();
	Id = id;
	this.name = name;
	EmailId = emailId;
	this.city = city;
	Department = department;
	PostName = postName;
	this.salary = salary;
	DOB = dOB;
	DOJ = dOJ;
	this.mode = mode;
}

}
