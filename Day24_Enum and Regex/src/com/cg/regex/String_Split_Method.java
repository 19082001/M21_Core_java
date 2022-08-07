package com.cg.regex;

import java.util.Scanner;

public class String_Split_Method {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="M1-16 @@ Snehal Jarag @@ Gauri @@ Pooja";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
