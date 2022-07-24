package com.cg.superkeyword;

//Super keyword:-it is used to invoke parent class constructor
class Flower
{
	
	Flower()
	{
		System.out.println("Flower");
		
	}
}
class Rose extends Flower
{
	Rose()
	{
		//we are invoking parent class constructor
		//first give the preference to constructor call than print the statement. 
		super();
		System.out.println("Rose is Red");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		Rose r=new Rose();

	}

}
