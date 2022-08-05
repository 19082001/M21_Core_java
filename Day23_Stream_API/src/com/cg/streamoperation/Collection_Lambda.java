package com.cg.streamoperation;

import java.util.LinkedList;

public class Collection_Lambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(13);
		System.out.println(obj);
		//obj.forEach(i->System.out.println(i));
		obj.forEach(System.out::println);

	}

}
