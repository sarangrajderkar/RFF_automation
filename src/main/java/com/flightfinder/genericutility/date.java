package com.flightfinder.genericutility;

public class date {

	public static void main(String[] args) {
		System.out.println((java.time.LocalDate.now().getDayOfMonth())+2);
		System.out.println(String.valueOf((int) (Math.random() * 900) + 100));
	}
}
