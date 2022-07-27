package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	@SuppressWarnings({ "unchecked","rawtypes" })
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("Snehal");
		obj.add(13);
		obj.add(15.3f);;
		System.out.println(obj);
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);

	}

}
