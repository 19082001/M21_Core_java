package com.cg.exception;

import java.util.Scanner;

public class FinalBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        try
        {
        int res=15/x;
        System.out.println(res);
        System.exit(0);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        finally
        {
        	System.out.println("Whether any exception is occured or nor,Finally Block is executed");
        }
        s.close();
	}

}
