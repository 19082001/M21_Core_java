package com.cg.poly;
//compiletime program
class A
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}
public class Poly1 {

	public static void main(String[] args) {
		A obj = new A();
		obj.add(2, 5);
		obj.add(3.0f, 4.2f);

	}

}
