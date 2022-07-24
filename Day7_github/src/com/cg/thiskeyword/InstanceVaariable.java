package com.cg.thiskeyword;

class Fruit
{
	private String str;
	private String str1;
	void accept(String str,String str1)
	{
		this.str=str;
		this.str1=str1;
		
	}
	void display()
	{
		System.out.println("the fisrt string is: "+str);
		System.out.println("the second string is: "+str);
	}
}
public class InstanceVaariable {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.accept("geeta","rita");
		f.display();

	}

}
