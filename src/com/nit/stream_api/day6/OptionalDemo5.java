package com.nit.stream_api.day6;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo5 {
	public static void main(String[] args) {
		
		ArrayList<Optional<String>> list= new ArrayList<>();
		list.add(Optional.of("Hyd"));
		list.add(Optional.of("Pune"));
		list.add(Optional.of("Banglore"));
		list.add(Optional.of("Kolkata"));
		list.add(Optional.of("Mumbai"));
		list.add(Optional.empty());
		

		for(Optional<String> opt : list)
		{
			if(opt.isPresent())
			{
				System.out.println(opt.get());
			}
			else {
				System.out.println("No value is available");
			}
		}
		
		
	}
}
