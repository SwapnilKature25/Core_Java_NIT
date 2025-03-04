package com.nit.stream_api.day8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Print the length of the country
public class CollectDemo3 {

	public static void main(String[] args) {
		List<String> listOfCountry = List.of("India", "Australia", "USA", "China","Japan");
		Map<String, Integer> map = listOfCountry.stream()
		.collect(Collectors.toMap(
						countryName -> countryName.toUpperCase(),
						countryName -> countryName.length()
				));
		
		map.forEach( (k,v) -> System.out.println(k+" "+v));
	
	}

}

/* AUSTRALIA 9
USA 3
CHINA 5
JAPAN 5
INDIA 5 */