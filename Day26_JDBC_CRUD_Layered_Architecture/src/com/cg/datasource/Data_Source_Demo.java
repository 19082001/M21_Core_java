package com.cg.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Data_Source_Demo {


	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		//to connect eclipse with mysql server: 
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		
		try {
			// Create a OracleDataSource instance explicitly
			Data_Source_Demo ods = new Data_Source_Demo();

			// Set the user name, password, driver type and network protocol
			

			// Retrieve a connection
			Connection conn=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			// Create a Statement
			Statement stmt = conn.createStatement();

			// Select the NAME column from the Account_1 table
			ResultSet rset = stmt.executeQuery("select Name from student");

			System.out.println(" Name are:- ");
			// Iterate through the result and print the Account holder names
			while (rset.next())
				System.out.println(rset.getString(1));

			// Close the RseultSet
			rset.close();
			rset = null;

			// Close the Statement
			stmt.close();
			stmt = null;
			// Close the connection
			conn.close();
			conn = null;
		} catch (SQLException se) {

			System.out.println("Error :-" + se.getMessage());
		}

	}
}



