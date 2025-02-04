package com.nit.collection;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo3 {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Grapes");		
		
	fruits.forEach(fruit -> System.out.println(fruit.toUpperCase()));

	}

}