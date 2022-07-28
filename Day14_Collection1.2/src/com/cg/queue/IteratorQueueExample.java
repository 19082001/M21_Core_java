package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Queue;

import java.util.Iterator;

public class IteratorQueueExample {

	public static void main(String[] args) {
			Queue<Integer> q = new ArrayDeque<Integer> ();
            for(int i=10; i<15; i++)
            {
            	q.add(i);
            	
            }
            System.out.println(q);
            boolean isadded = q.offer(25);
            System.out.println("Is added: " +isadded);
            System.out.println(q);
            Iterator<Integer>itr = q.iterator();
            System.out.println("The elements are: ");
            while(itr.hasNext())
            {
            	System.out.println(itr.next());
            }
	}

}
