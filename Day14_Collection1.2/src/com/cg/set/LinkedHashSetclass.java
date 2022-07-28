package com.cg.set;


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetclass {

	public static void main(String[] args) {
		Set<Object>obj = new LinkedHashSet ();
		obj.add("Snehal");
		obj.add(9);
		obj.add(4.5f);
		
        System.out.println(obj);
        //To extract the elements of a set separately.
        Object[] arr = obj.toArray();
        for(int i=0; i<arr.length; i++)
        {
        	System.out.println(arr[i]);
        }

	}

}
