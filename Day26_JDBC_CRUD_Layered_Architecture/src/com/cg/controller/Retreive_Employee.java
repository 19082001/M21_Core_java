package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retreive_Employee {
	
	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//To retrive a data
		String query="SELECT * FROM EMPLOYEE";
		Statement s=c.createStatement();
	    ResultSet r=s.executeQuery(query);
	    int count=0;
	    while(r.next())
	    {
	    	int ID=r.getInt(1);
	    	String Name=r.getString(2);
	    	Float Salary=r.getFloat(3);
	    	
	    	
	    	String output="User : %d %s %f";
	    	System.out.println(String.format(output, ID,Name,Salary));
	    }
	    c.close();
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
