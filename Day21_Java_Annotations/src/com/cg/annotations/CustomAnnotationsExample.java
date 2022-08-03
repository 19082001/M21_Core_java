package com.cg.annotations;

import java.lang.reflect.Method;

@interface Selection
{
	//abstract method
	//Multi value annotations
	String  print() default"snehal";
	int speed() default 5;
	float percentage() default 8.8f;
	
}
class N
{
	@Selection (print="Hello Student",speed=50,percentage=88.9f)
	public void display()
	{
		System.out.println("heyyy!it's Holiday");
	}
}

public class CustomAnnotationsExample  {

	
		public static void main(String[] args) {
			N b = new N();
			b.display();
			
			

	}

}
