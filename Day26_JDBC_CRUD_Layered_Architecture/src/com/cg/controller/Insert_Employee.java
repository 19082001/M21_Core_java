package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Employee {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//to insert rows.
		String query="INSERT INTO EMPLOYEE (ID,Name,Salary)VALUES(?,?,?)";
		PreparedStatement p = c.prepareStatement(query);
		p.setInt(1, 114);
		p.setString(2,"gauri");
		p.setFloat(3,11.4f);
		
		int r=p.executeUpdate();
		//if row>0 means atleast some rows are there
		if(r>0)
		{
			System.out.println("A new user is inserted successfully");
			
		}
		c.close();
	    }
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
