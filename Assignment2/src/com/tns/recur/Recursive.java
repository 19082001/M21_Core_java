package com.tns.recur;

import java.util.Scanner;

public class Recursive {
	 

			static int factorial(int n)
			{
				if(n==1)
		         return 1;
				
				else
				 return n*factorial(n-1);
				
	}
	
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int  n= s1.nextInt();
		
        	System.out.println(factorial(n));
        	s1.close();
	}
	
}
