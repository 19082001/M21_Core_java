package com.cg.exception;

public class Example1ex {
 static void main(String[] args){ 
        System.out.println("First line");
        System.out.println("Second line");
        int[] myIntArray = new int[]{1, 2, 3};
        print(myIntArray);
        System.out.println("Third line");
    } 
    public static void print(int[] arr) {
    	try {
        System.out.println(arr[3]);
        System.out.println("Fourth element successfully displayed!");
    	}catch(Exception e)
            {
            	System.out.println("Exception Handling");
            }
    	}
    }
