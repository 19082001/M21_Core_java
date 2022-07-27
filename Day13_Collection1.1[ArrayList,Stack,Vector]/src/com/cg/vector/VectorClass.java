package com.cg.vector;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Object>v = new Vector<Object> ();
        v.add("Snehal");
        v.add(13);
        v.add(13.4f);
        v.add("g");
        System.out.println(v);
	}

}
