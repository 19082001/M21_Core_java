package com.tns.recur;

import java.util.Scanner;

public class Assignmentq1 {

	static int factorial(int n)
	{
		if(n==0)
	    return 0;
			
		else if(n==1 || n==2)
         return 1;
		
		else
		 return factorial(n-1)+factorial(n-2);
		
}

public static void main(String[] args) {
	int maxNumber = 10;
	System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
	for(int i = 0; i < maxNumber; i++){
			System.out.println(factorial(i) +" ");
		}
}

}
