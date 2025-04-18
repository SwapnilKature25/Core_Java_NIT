package com.nit.stream_api.assignments.day3;

import java.util.List;
import java.util.function.Predicate;

class CustPredicate implements Predicate<String>
{

	@Override
	public boolean test(String t) {
		
		return t.startsWith("a")||t.startsWith("e")||t.startsWith("i")||t.startsWith("o")|| t.startsWith("u");
	}
	
}
public class CustomPredicate {
	public static void main(String[] args) {
		List<String> vowel= List.of("Alennn","Virat","Rohit","Igris","USA");
		
		vowel.stream()
		.filter(l -> l.length() > 4)
		.map(str -> str)
		.forEach(System.out::println); // Alenn Virat Rohit Igris

		
		
	}
}	
