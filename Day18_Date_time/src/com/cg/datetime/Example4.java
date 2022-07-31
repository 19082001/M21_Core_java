package com.cg.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example4 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		// it is plus day method in current date they add number of dates.
		LocalDate date2 = date1.plusDays(3);
		System.out.println(date2);
		//chronoUnit use for current date and how many plus day.
		long df=ChronoUnit.DAYS.between(date1, date2);
        System.out.println(df);
	}

}
