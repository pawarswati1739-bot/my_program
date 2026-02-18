package com.controller;

import java.util.Scanner;

import com.pojo.Employee;
import com.service.EmployeeService;
import com.service.StudentService;

public class EmployeeController {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		EmployeeService es= new EmployeeService();
		Employee e=new Employee();
		while(true) {
			System.out.println("1.insret data");
			System.out.println("2.update data");
			System.out.println("3.delete data");
			System.out.println("4.fetch All Record");
			System.out.println("Enter choice = ");
			int choice =sc.nextInt();
			
		switch(choice) {
		case 1:
		System.out.println("Enter id = ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name = ");
		String name=sc.nextLine();
		
		System.out.println("Enter EmailId =  ");
		String email=sc.nextLine();
		
		
		
		System.out.println("Enter Department = ");
		String department=sc.nextLine();
		
		System.out.println("Enter post name = ");
		String postName=sc.nextLine();
		
		System.out.println("Enter Salary = ");
		double salary=sc.nextDouble();
		sc.nextLine();
		
		
		System.out.println("Enter DOB = ");
		String dob=sc.nextLine();
		
		System.out.println("Enter DOJ = ");
		String doj=sc.nextLine();
		
		System.out.println("Enter Mode = ");
		String mode=sc.nextLine();
		
		System.out.println("Enter city = ");
		String city=sc.nextLine();
		
			es.insertData(e);
			break;
		case 2:
			System.out.println("Enter id to delete = ");
			int deleteId=sc.nextInt();
			sc.nextLine();
			es.deleteData(deleteId );
			break;
		case 3:
			Employee u =new Employee();
			System.out.print("Enter ID: ");
            u.setId(sc.nextInt());
            sc.nextLine();

            System.out.print("New Name: ");
            u.setName(sc.nextLine());

            System.out.print("New email: ");
            u.setEmailId(sc.nextLine());
            System.out.print("New City: ");
            u.setCity(sc.nextLine());
            

			es.updateData(u);
			break;
		case 4: 
			es.feachAllRecord(e);
			break;
		
		case 5:
			System.out.println("Exist");
			sc.close();
			return;
			default:System.out.println("Invalid data");
			
			
		}
		
		}
			
	}
}
