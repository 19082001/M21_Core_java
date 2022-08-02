package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//to update rows
		String query="UPDATE EMPLOYEE SET NAME=?,EMAILID=? WHERE ID=?";
		PreparedStatement p = c.prepareStatement(query);
		
		p.setString(1,"Gauri");
		p.setString(2,"gauri@gmail.com");
		p.setInt(3,121);
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
