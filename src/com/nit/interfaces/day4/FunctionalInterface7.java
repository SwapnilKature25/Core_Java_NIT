package com.nit.interfaces.day4;

import java.util.function.Predicate;

public class FunctionalInterface7 {
	public static void main(String[] args) {
		Predicate<Integer> grater = a -> a >15;
		
		Predicate<Integer> less = a -> a <10;
		
		boolean bool = grater.test(20);
		boolean bool1 = less.test(5);
		System.out.println(bool);
		System.out.println(bool1);		
		
		
		
		String str[]= {"Java","Python","Naresh","IT"};
		
		Predicate<String> prediacte = p -> p.endsWith("va");
		for(String s: str) 
		{
			if(prediacte.test(s))
			System.out.println(s);  //java
		}

	}

}
