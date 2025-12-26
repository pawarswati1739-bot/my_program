package com.emp;

public class Employee {
String empName;
int empID;
String EmpPost;
double empSalary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String empName, int empID, String empPost, double empSalary) {
	super();
	this.empName = empName;
	this.empID = empID;
	EmpPost = empPost;
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empID=" + empID + ", EmpPost=" + EmpPost + ", empSalary=" + empSalary
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpPost() {
	return EmpPost;
}
public void setEmpPost(String empPost) {
	EmpPost = empPost;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}

}
