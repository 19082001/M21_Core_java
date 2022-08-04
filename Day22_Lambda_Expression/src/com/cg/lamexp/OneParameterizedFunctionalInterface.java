package com.cg.lamexp;
//Functional Interface=which contain only ine abstract method
interface B
{
	//one-parameterized abstract method
	String print(String str);
}
public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//Lambda Expression
		B obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.print("Lambda Expression"));
		

	}

}
