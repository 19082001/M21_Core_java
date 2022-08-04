package com.cg.lamexp;

interface C
{
	int add(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		C obj=(int a,int b)->(a*b);
		System.out.println("Multilplication od A and B is: "+obj.add(13,5));
	

	}

}
