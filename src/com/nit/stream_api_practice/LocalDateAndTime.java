package com.nit.stream_api_practice;

 
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateAndTime 
{
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{	
	   LocalDate d = LocalDate.now();
	   System.out.println(d);
	   
	   LocalTime t = LocalTime.now();
	   System.out.println(t);
	   
	    LocalDateTime dt = LocalDateTime.now();
	    System.out.println(dt);

	    
	    LocalDate day=LocalDate.now();
	    DayOfWeek days=day.getDayOfWeek();
	    System.out.println(days);
	    
	    System.out.println("============================================");
	    
	    ZonedDateTime z = ZonedDateTime.now();
		System.out.println(z);
		
	    ZoneId zone = z.getZone();
	    System.out.println(zone);
	    
	    System.out.println(ZoneId.getAvailableZoneIds());    
	    
	}
}