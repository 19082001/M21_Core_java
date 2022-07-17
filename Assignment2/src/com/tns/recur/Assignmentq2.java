package com.tns.recur;

import java.util.Scanner;

public class Assignmentq2 {
	static int factorial(int n)
	{
			if(n==0)
	         return 0;
			else
				return (n % 10 + factorial(n / 10));
			
}

public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	int  n= s1.nextInt();
	
    	System.out.println(factorial(n));
    	s1.close();
}

}