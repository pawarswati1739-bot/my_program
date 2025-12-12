package com.company;

public class Employee extends Company {
	int empId = 101;
	String empName = "Swati Pawar";
	double salary = 45000;

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.companynName);
		System.out.println(e.loc);
		System.out.println(e.empId);
		System.out.println(e.salary);

	}

}
