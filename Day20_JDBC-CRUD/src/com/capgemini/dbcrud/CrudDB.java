package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		//try is used for throw exception when password incorrect.
		//to check whether the eclipse is connected with MYSQL or not.
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        if(c!=null)
        {
        	System.out.println("Connection is Established");
        	//when connection established you have to close it.
        	c.close();
        }
	    }
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
