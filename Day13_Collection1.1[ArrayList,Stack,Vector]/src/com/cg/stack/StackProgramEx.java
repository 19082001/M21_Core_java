package com.cg.stack;

import java.util.Stack;
import java.util.Vector;

public class StackProgramEx {

	public static void main(String[] args) {
		Stack<Object>s = new Stack<Object> ();
        s.push("Snehal");
        s.push(13);
        s.push(11);
        
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
	}

}
