package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now(ZoneId.of("Egypt"));
        LocalDateTime df = LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(t);
		
		//use for current time and zone
		System.out.println(df);
		
		//use for available zone and their Id.
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
