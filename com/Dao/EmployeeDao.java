package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pojo.Employee;

public class EmployeeDao {
	public void fetchAllRecord(Employee e) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
		
		PreparedStatement ps =c.prepareStatement("select*from Employee ");
		ResultSet rs= ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
		}
		c.close();
		
	}

	public void insertData(Employee e) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
		
		PreparedStatement ps=c.prepareStatement("insert into Employee(id,name,emailId,department,salary,DOB,DOJ,mode,city)values(?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setString(3,e.getEmailId());
		
		ps.setString(4,e.getDepartment());
		ps.setString(5,e.getPostName());
		ps.setDouble(6,e.getSalary());
		ps.setString(7,e.getDOB());
		ps.setString(8,e.getDOJ());
		ps.setString(9,e.getMode());
		ps.setString(10,e.getCity());
		int check=ps.executeUpdate();
		if(check>0){
			System.out.println("Data is inserted ........ ");
		}else {
			System.out.println("Data insertion fail ........ ");
		}
		c.close();
	}

	public void updateData(Employee e) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
		
		PreparedStatement ps=c.prepareStatement("update Employee set name=?,city=?, where id=?");
		
		ps.setString(1, e.getName());
		ps.setString(2,e.getCity());
		ps.setInt(3, e.getId());
		int check=ps.executeUpdate();
		if(check>0){
			System.out.println("Data is updated ........ ");
		}else {
			System.out.println("Data updation fail ........ ");
		}
		c.close();
	}

	public void deleteData(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
		
		PreparedStatement ps=c.prepareStatement("delete from Employee where id =?");
		ps.setInt(1, id);
		
		int check=ps.executeUpdate();
		if(check>0){
			System.out.println("Data is deleted ........ ");
		}else {
			System.out.println("Data is not delieted........ ");
		}
		c.close();
	}
	}


