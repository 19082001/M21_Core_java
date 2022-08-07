package com.cg.enum1;

public class Enum_Example_If_Else_Condition
{
		enum EmpType
		{
			Contract,Permanant,Temporary;
		}
        static void print(EmpType e)
        {
        	if(e==EmpType.Permanant)
        	{
        		System.out.println("Permanant Employee");
        	}
        	else if(e==EmpType.Contract)
        	{
        		System.out.println("Contract-Based Employee");
        	}
        	else
        	{
        		System.out.println("Temporary Employee");
        	}
        }
	public static void main(String[] args) {
		EmpType e = EmpType.Permanant;
		print(e);
      
	}

}
