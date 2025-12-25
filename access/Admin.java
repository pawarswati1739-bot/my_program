package com.access;

public class Admin extends Staff {
	public Admin(String name, int id, int aadhaarNo) {
		super(name, id, "Admin", aadhaarNo, "Admin Panel", "IT");
	}

	public void login(String username, String password) {
		System.out.println("Admin login successful");
	}

	public void generateReport() {
		System.out.println("Generating college report");
	}

	protected void manageWork() {
		System.out.println("Managing department: " + department);
	}

	

	public void showDetails() {
		Work();

	}

	@Override
	void Work() {
		System.out.println("Admin work");

	}

}
