package com.cg.annotations;

@interface Custom
{
	//abstract method
	//single value annotations
	String  print();
	
}
class B
{
	@Custom (print="Hello Student")
	public void display()
	{
		System.out.println("heyyy!it's Holiday");
	}
}
public class CustomAnnotations {

	public static void main(String[] args) {
		B b = new B();
		b.display();

	}

}
