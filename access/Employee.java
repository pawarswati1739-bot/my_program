package com.access;

public abstract class Employee {
	 private int aadhaarNo;          
	    protected String name;           
	    int id;                           
	                

	    Employee( int aadhaarNo, String name,int id) {
	        this.name = name;
	        this.id = id;
	       
	        this.aadhaarNo = aadhaarNo;
	    }

	    private void showAadhaar() {
	        System.out.println("Aadhaar No: " + aadhaarNo);
	    }

	    protected void showName() {
	        System.out.println("Name: " + name);
	    }
	    void showId() { 
	        System.out.println("ID: " + id);
	    }

	
	    abstract void custmerDetails();

}
