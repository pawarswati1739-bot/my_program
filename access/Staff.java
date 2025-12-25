package com.access;

public abstract class Staff {
	protected String department;

    Staff(String name, int id, String role, int aadhaarNo,
          String moduleName, String department) {
        super();
        this.department = department;
    }

    abstract void Work();
}
