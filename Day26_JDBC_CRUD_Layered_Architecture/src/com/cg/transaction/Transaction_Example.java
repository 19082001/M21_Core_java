package com.cg.transaction;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Transaction_Example {


	private static Connection conn;
	private static Savepoint spoint;

	public static void main(String[] args) {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		//to connect eclipse with mysql server: 
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Snehal@19";
		String query="SELECT * FROM STUDENT";
		
		try {
			
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			
			Connection conn = null;
			Savepoint spoint = null;
		
			conn.setAutoCommit(false);
			
			DatabaseMetaData dbmd = conn.getMetaData();

			//Check whether Savepoint is supported

			if (dbmd.supportsSavepoints())
				System.out.println("Savepoint is supported");
			else
				System.out.println("Savepoint is not supported");
			// Display the Account Details before transaction
			System.out.println("Before Transaction .....");
			Statement stmt0 = conn.createStatement();
			ResultSet rs1 = stmt0.executeQuery("select * from account_1");
			while (rs1.next()) {
				System.out.println(rs1.getInt(1) + "    " + rs1.getString(2)
						+ "     " + rs1.getInt(3));
			}
			spoint = conn.setSavepoint();

			Statement stmt1 = conn.createStatement();
			stmt1.executeUpdate("update account_1 set balance_Number=balance_Number-30 where Name='Snehal'");

			Statement stmt2 = conn.createStatement();
			stmt2.executeUpdate("update account_1 set balance_Number=balance_Number+10 where Name='Gauri'");

			conn.commit();
			System.out.println("After Transaction .....");
			Statement stmt3 = conn.createStatement();
			ResultSet rs2 = stmt3.executeQuery("select * from account_1");
			while (rs2.next()) {
				System.out.println(rs2.getInt(1) + "    " + rs2.getString(2)
						+ "     " + rs2.getInt(3));
			}

			conn.close();

		} catch (SQLException e) {

			System.out.println("Rollbacking Transaction .....");
			try {
			
			conn.rollback(spoint);

				System.out.println("After Rollback .....");
				Statement stmt3 = conn.createStatement();
				ResultSet rs2 = stmt3.executeQuery("select * from account_1");
				while (rs2.next()) {
					System.out.println(rs2.getInt(1) + "    "
							+ rs2.getString(2) + "     " + rs2.getInt(3));
				}

			} catch (SQLException ae) {
				System.out.println("Error " + ae.getMessage());
			}

		}

	}

}
