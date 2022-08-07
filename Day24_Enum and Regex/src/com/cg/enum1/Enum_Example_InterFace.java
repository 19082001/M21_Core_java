package com.cg.enum1;

interface Pizza
{
	void display();
}

enum size implements Pizza
{
	small,medium,large,extralarge;
		
	    // it is use to say we are override the function
	    @Override
		public void display()
		{
		    System.out.println("Size is:" +this);
		}
}
public class Enum_Example_InterFace {

	public static void main(String[] args) {
		size.large.display();

	}

}
