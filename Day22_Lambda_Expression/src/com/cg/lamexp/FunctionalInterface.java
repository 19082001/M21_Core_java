package com.cg.lamexp;

interface A
{
	void show();
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		A obj=()->
		{
			System.out.println("program of functional inheritance using lambda function");
		};
        obj.show();
	}

}
