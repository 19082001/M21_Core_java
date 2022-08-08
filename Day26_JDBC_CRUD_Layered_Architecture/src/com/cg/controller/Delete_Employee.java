package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_Employee {
	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//TO delete rows
		String query="DELETE FROM EMPLOYEE WHERE ID=?";
		PreparedStatement p = c.prepareStatement(query);
		
		
		p.setInt(1,114);
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
