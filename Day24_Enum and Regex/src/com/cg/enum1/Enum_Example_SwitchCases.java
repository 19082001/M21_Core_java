package com.cg.enum1;

enum Bike
{
	Pulser,KTM,R3,R15
}
public class Enum_Example_SwitchCases {

	public static void main(String[] args) {
		Bike b=Bike.KTM;
		switch(b)
		{
		case Pulser:
			System.out.println("You choose pulser");
		    break;
		case KTM:
			System.out.println("You choose KTM");
		    break;
		case R3:
			System.out.println("You choose R3");
		    break;
		case R15:
			System.out.println("You choose R15");
		    break;
		    
		default:
			System.out.println("Invalid name");
		}

	}

}
