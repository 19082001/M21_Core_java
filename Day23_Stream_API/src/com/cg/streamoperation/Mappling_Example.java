package com.cg.streamoperation;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Mappling_Example {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"Apple","banana","mango","Litchi"});
		System.out.println("word length for object-fruits");
		obj.stream().map(String::length).forEach(i->System.out.print(i+" "));
        List<Integer>obj1=Arrays.asList(new Integer[] {12,23,34,45,56});
        obj1.stream().map(i->i*i).collect(Collectors.toList());
       //obj.forEach(System.out::println);
        System.out.print(obj1+" ");
	}

}
