package com.nit.stream_api_practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	 public static void main(String[] args) 
	  {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		
		String formattedDateTime = ldt.format(formatter);
		System.out.println("Formatted DateTime: " + formattedDateTime);
	  }
}
