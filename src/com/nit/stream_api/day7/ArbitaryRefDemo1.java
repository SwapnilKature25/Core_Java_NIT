package com.nit.stream_api.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ArbitaryRefDemo1 {
	public static void main(String[] args) {
		Vector<Integer> listOfNumbers = new Vector<>();
		listOfNumbers.add(12);
		listOfNumbers.add(22);
		listOfNumbers.add(2);
		listOfNumbers.add(5);
		
		//By Using lambda Expression
		Collections.sort(listOfNumbers, (i1,i2) -> i2.compareTo(i1));
		System.out.println(listOfNumbers);
		
		System.out.println("==============");
		
		//By Using Method Reference
		Collections.sort(listOfNumbers, Integer::compareTo);
		System.out.println(listOfNumbers);
		
		System.out.println("==============");
		System.out.println("==============");
		
	
		//By Using lambda Expression
		String players[] = {"Virat", "Rohit", "Rishab", "SKY"};
		Arrays.sort(players, (s1,s2) -> s2.compareTo(s1));
		System.out.println(Arrays.toString(players));
		
		System.out.println("================");
		
		//By Using Method Reference
		Arrays.sort(players, String::compareTo);
		System.out.println(Arrays.toString(players));
		
		
		
		
		
	}
}
