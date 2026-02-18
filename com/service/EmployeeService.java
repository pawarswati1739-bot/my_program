package com.service;

import com.Dao.EmployeeDao;

import com.pojo.Employee;

public class EmployeeService {
	
	public void insertData(Employee e) throws Exception {
		EmployeeDao  ed= new EmployeeDao();
		ed.insertData(e);
		
	}

	public void updateData(Employee e) throws Exception {
		EmployeeDao  ed= new EmployeeDao();
		ed.updateData(e);
	}

	public void deleteData(int id) throws Exception {
		EmployeeDao  ed= new EmployeeDao();
		ed.deleteData(id);
	}
	public void feachAllRecord(Employee e) throws Exception {
		EmployeeDao  ed= new EmployeeDao();
		ed.fetchAllRecord(e);
		
	}
}
