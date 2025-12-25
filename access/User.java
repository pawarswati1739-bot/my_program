package com.access;

public abstract class User extends Employee implements Login , LoginReport {
	protected String name;

	User(String name, int id, String role, int aadhaarNo, String moduleName) {
        super(id, role, aadhaarNo);
      String Name =  this.name ="Swati";
    }
abstract void accessUser();
}
