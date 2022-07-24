package com.cg.array;

class Employee{
	public static Object[] arr;
	public int EmpId;
	public String Name;
	//constructor to initialize the value 
	Employee(int id,String name)
	{
		EmpId=id;
		Name=name;
	}
}
public class ClassNonPrimitiveArray {

	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(12,"sita");
		arr[0]=new Employee(13,"rita");
		arr[0]=new Employee(14,"gita");
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at "+i+" index is "+arr[i]."Empid+"arr[i].Name");
		}*/
	}

}
