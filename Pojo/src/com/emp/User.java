package com.emp;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Employee e=new Employee();
	System.out.println("Enter Emp.Name=");
	e.setEmpName(sc.nextLine());
	System.out.println("Enter Emp ID =");
	e.setEmpID(sc.nextInt());
	System.out.println("Enter Emp Post =");
	e.setEmpPost(sc.next());
	System.out.println("Enter Emp salary" );
	e.setEmpSalary(sc.nextDouble());
	System.out.println("Employee Name =" + e.getEmpName());
	System.out.println("Employee ID ="+ e.getEmpID());
	System.out.println("Employee Post ="+ e.getEmpPost());
	System.out.println("Employee Salary ="+ e.getEmpSalary());

}
}
