package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//hashset ia an unordered set.
		Set<Object>obj = new HashSet<Object> ();
		obj.add("Snehal");
		obj.add("v");
		obj.add(4.5);
		obj.add(40);
		obj.add(5);
		obj.add(55);
		obj.add(9);
        System.out.println(obj);
		
	}

}
