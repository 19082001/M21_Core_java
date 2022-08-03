package com.cg.annotations;

//@override annotations is giving the extra information about the method.
class Car
{
	void speed(int s)
	{
		System.out.println("Speed is : "+s+"km/hr");
	}
}
class BMW extends Car
{
	@Override
	void speed(int s)
	{
		System.out.println("Speed is : "+s+"km/hr");
	}
}

public class OverrideAnnotations

{
	public static void main(String args[])
	{
    BMW b=new BMW();
    b.speed(60);
}
}
