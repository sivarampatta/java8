package com.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {

	public static void main(String[] args) {
		LocalDate of=LocalDate.now();
		System.out.println(of);
		
		LocalDate date=LocalDate.of(2025, 5, 02);
		System.out.println(of);
		
		date=date.plusDays(3);
		System.out.println(date);
		
		date=date.plusMonths(2);
		System.out.println(date);
		
		date = date.plusYears(5);
		System.out.println(date);
		
		boolean date2 = LocalDate.parse("2025-02-01").isLeapYear();
		System.out.println(date2);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		Period period = Period.between(LocalDate.parse("1991-05-20"), LocalDate.now());
		System.out.println(period);

		Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(duration);


	}

}
