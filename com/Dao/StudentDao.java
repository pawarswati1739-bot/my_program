package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
public void fetchAllRecord() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
	
	PreparedStatement ps =c.prepareStatement("select*from student where id=?");
	ResultSet rs= ps.executeQuery();
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
	}
	c.close();
	
}

public void insertData() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
	
	PreparedStatement ps=c.prepareStatement("insert into student(id,name,city)values(?,?,?)");
	ps.setInt(1, 1);
	ps.setString(2, "swati");
	ps.setString(3,"miraj");
	int check=ps.executeUpdate();
	if(check>0){
		System.out.println("Data is inserted ........ ");
	}else {
		System.out.println("Data insertion fail ........ ");
	}
	c.close();
}

public void updateData() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
	
	PreparedStatement ps=c.prepareStatement("update student set name=?,city=?, where id=?");
	
	ps.setString(1, "jyoti");
	ps.setString(2,"miraj");
	ps.setInt(3, 14);
	int check=ps.executeUpdate();
	if(check>0){
		System.out.println("Data is updated ........ ");
	}else {
		System.out.println("Data updation fail ........ ");
	}
	c.close();
}

public void deleteData() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bacth425", "root", "root");
	
	PreparedStatement ps=c.prepareStatement("delete from student where id =?");
	ps.setInt(1, 14);
	
	int check=ps.executeUpdate();
	if(check>0){
		System.out.println("Data is deleted ........ ");
	}else {
		System.out.println("Data is not delieted........ ");
	}
	c.close();
}
}
