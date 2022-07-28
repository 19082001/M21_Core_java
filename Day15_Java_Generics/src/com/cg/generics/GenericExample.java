package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<Integer>();
        obj.add(11);
        //1.Compile-Time checking and type sife
      //  obj.add("12");
        
        System.out.println(obj);
        
        //2.Type-casting is not required in Generics
      List<String>obj1=new LinkedList<String>();
      //list obj1=new LinkedList();
      obj1.add("Snehal");
      obj1.add("Chocalate");
      String str = obj1.get(1);
      
      //type-casting explicitily if there is not an object -type
     // String str1=(String)obj1.get(1);
      System.out.println(str);
	}

}
