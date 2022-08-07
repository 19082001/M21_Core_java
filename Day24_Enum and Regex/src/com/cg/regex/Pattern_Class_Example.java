package com.cg.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern_Class_Example {

	public static void main(String[] args) {
		String pattern="Snehal Jarag";
		Scanner s=new Scanner (System.in);
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();

	}

}
