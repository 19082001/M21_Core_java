package com.cg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DBUtil {

	public static void main(String[] args) throws SQLException{
		
		//to connect eclipse with mysql server: 
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		//if class name of the driver is incorrect, then it will throw an exception.
        try
        {   
        	Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        	if(c!=null)
            {
        	    System.out.println("Connection is established");
            }
        	
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }
   
  }

}
