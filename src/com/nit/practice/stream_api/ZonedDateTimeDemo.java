package com.nit.practice.stream_api;

 

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo 
{
	public static void main(String[] args) 
	{
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
		
	    ZoneId zone = z.getZone();
	    System.out.println(zone);
	    
	    System.out.println(ZoneId.getAvailableZoneIds());    
	   
	    	
	}

}