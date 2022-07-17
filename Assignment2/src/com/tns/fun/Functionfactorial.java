package com.tns.fun;

import java.util.Scanner;

public class Functionfactorial {

	static int Functionfactorial(int a)
	{
		int fact=1;
		for(int i=1; i<=a; i++)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int  a= s1.nextInt();
		
        	System.out.println(Functionfactorial(a));
        	s1.close();
	}

	

}
