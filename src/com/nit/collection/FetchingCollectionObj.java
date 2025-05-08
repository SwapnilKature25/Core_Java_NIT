package com.nit.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class FetchingCollectionObj {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Grapes");
		
		System.out.println("1] toString() =======================");
		System.out.println(fruits.toString());
		
		System.out.println("2] for() =======================");
		// 1. for loop
		for(int i=0; i<fruits.size(); i++)
		{
			System.out.print(fruits.get(i)+" ");
		}
		System.out.println("3] forEach()=======================");
		// 2. forEach() loop
		for(String fr : fruits)
		{
			System.out.print(fr+" ");			
		}
		
		System.out.println("4] Enumeration =======================");
		// 3. Enumeration
		
		Enumeration<String> elements = fruits.elements();
		while(elements.hasMoreElements())
		{
			System.out.print(elements.nextElement()+" ");
		}
		
		System.out.println("5] iterator() =======================");
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	
		System.out.println("6] listIterator() =======================");
		ListIterator<String> listIterator = fruits.listIterator();
		System.out.println("In forward direction");
		while(listIterator.hasNext())
		{
			System.out.print(listIterator.next()+" ");
		}
		System.out.println();
		System.out.println("In Backward direction");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
		System.out.println("7] splitIterator()=======================");
		Spliterator<String> spliterator = fruits.spliterator();
		spliterator.forEachRemaining(fruit -> System.out.println(fruit));
		
		System.out.println("8] forEach() method=======================");
		fruits.forEach(System.out::println);

		System.out.println("9] Method reference=======================");
		fruits.forEach(System.out::println);
	}
}
