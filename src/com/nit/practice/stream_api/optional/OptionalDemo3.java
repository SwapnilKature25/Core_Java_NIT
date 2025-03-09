package com.nit.practice.stream_api.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) {
		List<Optional<String>> listOfCity = new ArrayList<>();
		listOfCity.add(Optional.of("Pune"));
		listOfCity.add(Optional.of("Mumbai"));
		listOfCity.add(Optional.of("Hyd"));
		listOfCity.add(Optional.of("Banglore"));
		listOfCity.add(Optional.empty());

		for(Optional<String> opt : listOfCity)
		{
			if(opt.isPresent())
			{
				System.out.println(opt.get());
			}
			else 
			{
				System.out.println("No Value in the List");
			}
		}
	
	}

}
