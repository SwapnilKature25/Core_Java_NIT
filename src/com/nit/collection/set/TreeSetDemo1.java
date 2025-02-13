package com.nit.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1
{
	public static void main(String[] args) 
	{
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Orange"); 
		t1.add("Mango");
		t1.add("Pear");
		t1.add("Banana");
		t1.add("Apple");	
		System.out.println("In Ascending order");
		t1.forEach(i -> System.out.println(i));

		TreeSet<String> t2 = new TreeSet<>();
		t2.add("Orange");
		t2.add("Mango");
		t2.add("Pear");
		t2.add("Banana");
		t2.add("Apple");

        System.out.println("In Descending order");
//		Iterator<String> itr2 = t2.descendingIterator();  //for descending order
        Iterator<String> desitr = t2.descendingIterator();
         desitr.forEachRemaining(x -> System.out.println(x));		
	}
}
