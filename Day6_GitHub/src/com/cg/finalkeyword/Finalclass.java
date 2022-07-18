package com.cg.finalkeyword;

class Vehicle
{
	void display()
	{
		System.out.println("Vehical Type");
		
	}

	public void accept() {
		// TODO Auto-generated method stub
		
	}
}
class Bike extends Vehicle
{
	void print()
	{
	System.out.println("Bike");
	}
	
}
public class Finalclass {

	public static void main(String[] args) {
		 
		Vehicle Bike=new Vehicle ();
		Bike.accept();
		
	}

}
