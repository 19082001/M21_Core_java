package com.cg.inheritanceex;
//program for Hierarchical Inheritance
class MobileBrand
{
	void displayName()
	{
		System.out.println("Brand is: Sasung");
	}
}
class SamsungM31 extends MobileBrand
{
	void display()
	{
		System.out.println("Samsung Galaxy M31");
		
	}
}
class SamsungM31s extends MobileBrand
{
	void display()
	{
		System.out.println("Samsung Galaxy M31s");
		
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		SamsungM31s m=new SamsungM31s();
		m.display();
		m.displayName();
		
		SamsungM31 m1=new SamsungM31();
		m1.display();
	}

}
