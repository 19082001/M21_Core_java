package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object> d = new ArrayDeque<Object> ();
        // Adding elements from front and rear end.
		d.add(10);
		d.addFirst(15);
		d.addLast("Snehal");
		//Remove elements from front and rear end.
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
	}

}
