package com.cg.thiskeyword;

class A
{
	int a;
	
	A(int a)
	{
		this.a=a;
	}
}
public class Constructorargument {

	public static void main(String[] args) {
		A obj=new A(5);
		System.out.println("The value of a is: "+obj.a);

	}

}
