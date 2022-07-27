package com.cg.annonclass;

abstract class Annonymus
{
	public abstract void method();
}
public class DemoClass {

	public static void main(String[] args) {
		Annonymus a = new Annonymus()
				{
			        public void method()
			        {
			        	System.out.println("This is example of Annonumus class");
			        }
				};
			a.method();	
	}

}
