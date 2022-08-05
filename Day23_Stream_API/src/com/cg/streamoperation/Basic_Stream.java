package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic_Stream {

	public static void main(String[] args) {
		//Stream can be created with static data
		Stream<String>obj=Stream.of("snehal","siddi","vaibhav","Tejas");
		obj.forEach((i)->System.out.print(i+" "));
		System.out.println();
		//stream can be accquired from array of collection.
		List<String>obj1=Arrays.asList(new String[] {"Pune","Mumbai","Nashik","Nagpur"});
		obj=obj1.stream();
		//obj.forEach((i)->System.out.print(i));
		obj.forEach(System.out::println);

	}

}
