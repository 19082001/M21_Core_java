package com.cg.poly;

class Multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
		
	}
	
}
class Mult extends Multiplication
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Mult m = new Mult();
		m.accept(21, 9);
		Multiplication m1 = new Multiplication();
        m1.accept(22, 6);
	}

}
