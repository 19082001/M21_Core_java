package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public class Stream_Operation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,40,50,10);
		//obj.stream().distinct().forEach(System.out::println);
		obj.stream().distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		//it sets the limit -first n -limit elements
		obj.stream().limit(3).forEach(i->System.out.print(i+" "));
		System.out.println();
		obj.stream().sorted().forEach(i->System.out.print(i+" "));
	}

}
