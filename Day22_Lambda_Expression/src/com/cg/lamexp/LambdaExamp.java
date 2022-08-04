package com.cg.lamexp;

interface E
{
	String show(String str1, String str2);
}
public class LambdaExamp {

	public static void main(String[] args) {
		/*E obj=(String str1, String str2)->
		{
			return str1+str2;
		};*/
		E obj=(String a,String b)->(a+b);
        System.out.println("String are: "+obj.show("Snehal", " "+ "Nia"));
	}

}
