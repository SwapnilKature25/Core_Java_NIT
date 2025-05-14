package com.nit.stream_api_practice;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class IndividualZoneId {

	 public static void main(String[] args)
	    {
	        ZoneId ausTimeZone = ZoneId.of("Australia/Sydney");
	        ZonedDateTime aus = ZonedDateTime.now(ausTimeZone);        
	        System.out.println("Current Date and Time in Australia Time Zone: " + aus);
	        
	              
	        
	        ZoneId canadaTimeZone = ZoneId.of("Canada/Atlantic");
	        ZonedDateTime canada = ZonedDateTime.now(canadaTimeZone);        
	        System.out.println("Current Date and Time in Canada Time Zone: " + canada);
	        
	        
	    }
}
