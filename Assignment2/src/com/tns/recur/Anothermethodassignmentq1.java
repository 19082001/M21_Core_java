package com.tns.recur;

import java.util.Scanner;

public class Anothermethodassignmentq1 {
	static int count=0,first=0,end=1,fibo=0;
	
	static int factorial(int n)
	{
        count++;
        
        fibo=first+end;
       
        if(fibo<=n)
        {
            System.out.print(" "+fibo+" ");
            first=end;
            end=fibo;
          
           factorial(n);
        }
		return n;
   
	}
    public static void main(String[] args)
    {
   
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Fibonacci series till the point "+n+" is= "+0+" "+1);
        factorial(n);
 
    }
}