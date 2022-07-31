package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example1 {

	public static void main(String[] args) {
		//use for separate date and time 
		//LocalDate l = LocalDate.now(); 
		//LocalTime t = LocalTime.now();
		//System.out.println(l);
		//System.out.println(t);
		
		//use for both date and time
		//LocalDateTime dt = LocalDateTime.now();
		//System.out.println(dt);
		
		// use for any date and local date and time
		LocalDateTime dt = LocalDateTime.now();
		LocalDate d = LocalDate.of(2022, Month.FEBRUARY, 28);
		System.out.println(dt);
		System.out.println(d);
		
	}

}
