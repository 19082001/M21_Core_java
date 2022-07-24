package com.cg.array;
//compile time array 
public class Classarray {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		//method for one or two array output 
       // System.out.println(arr[3]+" "+arr[4]);
		//method for all array output 
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
		//another method for all array output
		//Enhance for loop
		for(int x:arr)
		{
			System.out.println(x+ " ");
		}
	}

}
