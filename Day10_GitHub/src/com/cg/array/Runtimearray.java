package com.cg.array;

import java.util.Scanner;

public class Runtimearray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		//int arr[]=new int[5];
		
       System.out.println("Enter the value: ");
       //to enter the elements in the array 
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("Enter" + i+"value");
    	   arr[i]=s.nextInt();
       }
       //for print the array value that we gave as a inut 
       for(int x:arr)
       {
    	   System.out.println(x+" ");
       }
	}

}
