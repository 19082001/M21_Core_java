package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CurdInsert {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//to insert rows.
		String query="INSERT INTO EMPLOYEE (ID,NAME,EMAILID,PASSWORD)VALUES(?,?,?,?)";
		PreparedStatement p = c.prepareStatement(query);
		p.setInt(1, 113);
		p.setString(2,"snehal");
		p.setString(3,"snehal@gmail.com");
		p.setString(4,"snehal@123" );
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
