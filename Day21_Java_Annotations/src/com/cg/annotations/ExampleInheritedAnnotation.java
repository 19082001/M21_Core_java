package com.cg.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
//if we need to inherit an annotation from superclass then go with inherited annotation
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)

@interface CustomB
{
	//abstract method
	//Multi-value annotation
	String print();
}


class E
{
	@CustomB(print = "SNEHAL")
	public void display()
	{
		
		System.out.println("Display Inherited");
	}
}
class F extends E
{
	public void display1()
	{
		System.out.println("Display Inherited : 1");
	}
}

public class ExampleInheritedAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		F obj=new F();
		obj.display();
		obj.display1();
		Method m=obj.getClass().getMethod("display");
		CustomB obj1=m.getAnnotation(CustomB.class);
		
		System.out.println(obj1.print());

	}

}
