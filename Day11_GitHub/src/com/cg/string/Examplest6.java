package com.cg.string;

import java.util.StringTokenizer;

public class Examplest6 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Lets try this");
		while(st.hasMoreTokens()) {
			
		
		System.out.println(st.nextToken());
		}
		//System.out.println(st.nextToken());

	}

}
