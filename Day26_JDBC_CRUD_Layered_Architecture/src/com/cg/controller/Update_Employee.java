package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Employee {
	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		try
		{
		        Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		        //to update rows
		        String query="UPDATE EMPLOYEE SET Name=?,Salary=? WHERE ID=?";
		        PreparedStatement p = c.prepareStatement(query);
		
		        p.setString(1,"snehal");
		        p.setFloat(2,11.4f);
		        p.setInt(3,113);
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
