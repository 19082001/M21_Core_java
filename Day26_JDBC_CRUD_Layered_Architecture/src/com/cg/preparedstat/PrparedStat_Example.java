package com.cg.preparedstat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrparedStat_Example {
	
	public static void main(String[] args) {
		
        int eno=0;
        String ename=null;
        double esal=0.0;
        try{
        
        System.out.println("Enter the Employee Number := ");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));       
        eno=Integer.parseInt(br1.readLine());
        
        System.out.println("Enter the Employee Name := ");
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));       
        ename=br2.readLine();
        
        System.out.println("Enter the Employee Salary := ");
        BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));       
        esal=Double.parseDouble(br3.readLine());
        
        
               
        
        }catch(IOException e){ 
        	System.out.println(e.getMessage());
        }
        
        
		try	{
			String dbDriver="com.mysql.cj.jdbc.Driver";
			//to connect eclipse with mysql server: 
			String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
			String dbUsername="root";
			String dbPassword="Snehal@19";

			Connection conn=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			PreparedStatement pstmt = conn.prepareStatement("insert into trans1 (eno,ename,esal) values(?,?,?)");
			
			pstmt.setInt(1, eno);
			pstmt.setString(2,ename);
			pstmt.setDouble(3,esal);
			
			int count=pstmt.executeUpdate();
					
			
			System.out.println("Record is inserted successfully !!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}


}
