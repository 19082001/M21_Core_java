package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//ArrayDeque will print the element of a queue is same insertion order
		Queue<Object>q=new ArrayDeque<Object>();
		q.offer(11);
		q.add(12);
		q.add(10);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.peek());
		
		//priorityQueue will print the elements using priority of the element
		Queue<Object>q1=new PriorityQueue<Object>();
		q1.offer(4);
		q1.add(2);
		q1.add(5);
		System.out.println(q1);
		System.out.println(q1.peek());
		
	}

}
