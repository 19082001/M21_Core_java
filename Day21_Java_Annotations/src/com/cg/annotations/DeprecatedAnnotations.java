package com.cg.annotations;

class A
{
	//it allows any elements no longer to be used
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to the C2TC program");
	}
}
public class DeprecatedAnnotations {

	public static void main(String[] args) {
		A a=new A();
		a.print();

	}

}
