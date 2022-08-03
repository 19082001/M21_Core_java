package com.cg.annotations;
class Animal
{
	//Non-paramerized 
	Animal()
	{
		System.out.println("Lion");
	}
	/*public void sound()
	{
		System.out.println("Roars");
	}*/

}


public class SuppressWarningAnnotations {

	public static void main(String[] args) {
		//remove suppressed warning
		@SuppressWarnings("unused")
		Animal a=new Animal();
		

	}

}
