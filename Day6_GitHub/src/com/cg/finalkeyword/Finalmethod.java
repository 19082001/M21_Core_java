package com.cg.finalkeyword;
class C
{
	//we can't override any final method
	//final void accept()
	void accept()
	{
		System.out.println("Hey there, i wanna provide restriction");
		
	}
}
class D extends C
{
	void accept()
	{
		System.out.println("restriction provided ");
	}
}
public class Finalmethod {

	public static void main(String[] args) {
		D d=new D();
		d.accept();
		

	}

}
