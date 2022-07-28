package com.cg.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		//
		Set<Object>obj = new LinkedHashSet<Object> ();
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
