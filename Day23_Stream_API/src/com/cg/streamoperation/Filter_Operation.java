package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public abstract class Filter_Operation {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,56.8f,61.5f);
		//System.out.println(obj);
		//filtering with condition:filter(predicate)
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);
		

	}

}
