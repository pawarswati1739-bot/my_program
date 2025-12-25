package com.access;

public class Student extends User {
	String Course;
	 public Student(String name, int id, int aadhaarNo) {
	        super(name, id, "Student", aadhaarNo, "Course ");
	    }

	    public void login(String username, String password) {
	        System.out.println("Student login successful");
	    }

	   

	    public void showDetails() {
	        showName();   
	        showId();     
	      
	    }

		@Override
		public void gerateReport() {
			// TODO Auto-generated method stub
			System.err.println("Student Login Report");
		}

		@Override
		void accessUser() {
			// TODO Auto-generated method stub
			System.err.println("Access User typte :Student");
		}

		@Override
		void custmerDetails() {
			// TODO Auto-generated method stub
			System.err.println("Student Details");
		}

		
}
