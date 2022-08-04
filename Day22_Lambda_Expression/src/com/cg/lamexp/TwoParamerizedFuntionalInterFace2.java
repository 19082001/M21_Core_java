package com.cg.lamexp;

interface F
{
	String numbers(String a,String b);
}




public class TwoParamerizedFuntionalInterFace2 {

	public static void main(String[] args) {
		F obj =(String a,String b)->
		{
			
			System.out.println(" "+a+" "+b);
			return "ab";
		};
		obj.numbers("S","V");
		


	}

}
