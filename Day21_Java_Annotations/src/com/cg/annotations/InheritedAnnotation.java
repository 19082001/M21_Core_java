package com.cg.annotations;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
@Documented
@Retention(RetentionPolicy.RUNTIME)

@interface CustomA
{
	//abstract method
	//Multi-value annotation
	String print();
}
class D
{
	@CustomA(print="Snehal")
	public void display()
	{
		System.out.println("Displaying inherited");
	}
}
public class InheritedAnnotation {

	public static void main(String[] args) {
		D obj=new D();
		obj.display();
		

	}

}
