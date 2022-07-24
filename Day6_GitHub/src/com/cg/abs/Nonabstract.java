package com.cg.abs;
abstract class D
{
	void print()
	{
		System.out.println("Non-abstract method");
	}
}
class C extends D
{
	void display()
	{
		super.print();
		System.out.println("Child class-B");
	}
	//as B is inheriting the properties of A class then it has print method.
}
public class Nonabstract {

	public static void main(String[] args) {
		C a=new C();
		a.display();
		

	}

}
