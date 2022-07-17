package com.tns.oop;

import java.util.Scanner;

class C
{
	int rollno;
	String name;
	int rollno1;
	String name1;
	
	C(int r, String n)
	{
		rollno = r;
		 name=n;
		 rollno1 = r;
		 name1=n;
		
	}
	
	void print()
	{
		System.out.println(" rollno is: "+rollno+" and name is: "+name);
		
	}
}
public class Examplepara {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int rollno= s1.nextInt();
		String name=s1.nextLine();
		int rollno1= s1.nextInt();
		String name1=s1.nextLine();
		C obj = new C(rollno, name);
		C obj1 = new C(rollno1,name1);
        obj.print();
        obj1.print();
        s1.close();
	}

}
