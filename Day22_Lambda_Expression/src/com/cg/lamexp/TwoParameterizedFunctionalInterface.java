package com.cg.lamexp;


interface D
{
	int show(int a,int x);
}


	
public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		D obj=(int a,int d)->
		{
			return a+d;
		};
		System.out.println(obj.show(11,19));

	}

}
