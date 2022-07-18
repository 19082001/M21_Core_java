package com.cg.abs;

abstract class A
{
   void print()
   {
	   System.out.println("Non-abstract method");
   }
}

class B extends A
{
	
}

	public class NonAbstractmethod {


	public static void main(String[] args) {
		A a = new B();
		a.print();
		

	}

}
