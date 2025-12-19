package com.referance;

public class Employee extends Company{
int id ;
double salary;
void emp(int id ,double salary) {
	this.id=id;
	this.salary=salary;
	
}
void dispaly() {
	System.out.println("Emp ID ="+ id);
	System.out.println("Emp salary ="+ salary);
}

@Override
	void companyName() {
		
		System.out.println("TSC....");
	}
@Override
	void Com_loc() {
		System.out.println("Bosari Pune");
}
}
