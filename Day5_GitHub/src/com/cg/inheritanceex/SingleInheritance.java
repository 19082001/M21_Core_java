package com.cg.inheritanceex;
//Program on single Inheritance
class Bike{
	public int speed=50;
	//method
	void speed()
	{
		System.out.println("The speed of Bike is: "+speed+"km/hr");
		
	}
//inheritance
}class Pulser extends Bike
{
	public int speed=70;
	void average()
	{
		System.out.println("Good");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Pulser p=new Pulser();
		p.speed();
		p.average();

	}

}
