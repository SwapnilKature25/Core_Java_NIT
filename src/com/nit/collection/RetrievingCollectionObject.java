package com.nit.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject {
	public static void main(String[] args) {
		Vector<String> fruits=new Vector<>();
		fruits.add("Orange");	
		fruits.add("Apple");	
		fruits.add("Kiwi");	
		fruits.add("Grapes");	
		
		Enumeration e=null;
		
//		There are 9 ways to fetch the Collection Object
		System.out.println("1. BY USING TOSTRING METHOD : ");
		System.out.println(fruits.toString());
		
		
		
		System.out.println("2. BY USING ORDINARY FOR LOOP : ");
		for(int i=0; i<fruits.size(); i++)
		{
			System.out.println(fruits.get(i));
		}
		
		
		
		System.out.println("3. BY USING  FOR-EACH LOOP : ");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
		System.out.println("4. BY USING Enumeration Interface : ");
		Enumeration<String> ele=fruits.elements();
		
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		
		
		
		System.out.println("5. BY USING Iterator Interface : ");
		Iterator<String> itr=fruits.iterator();
		itr.forEachRemaining(fruit -> System.out.println(fruit));
		
		
		
		System.out.println("6. BY USING Iterator Interface : ");
		ListIterator<String> lstItr=fruits.listIterator();
		
		System.out.println("Iterating in Forward Direction : ");
		while(lstItr.hasNext())
		{
			System.out.println(lstItr.next());
		}
		
		System.out.println("Iterating in Backward Direction : ");
		while(lstItr.hasPrevious())
		{
			System.out.println(lstItr.previous());
		}
		
		
		System.out.println("7. BY USING SplitIterator Interface : ");
		Spliterator<String> splItr=fruits.spliterator();
		splItr.forEachRemaining(fruit -> System.out.println(fruit));
		
		
		System.out.println("8. BY USING For-Each Method : ");
		fruits.forEach(fruit -> System.out.println(fruit));
		
		
		System.out.println("9. BY USING Method Reference : ");
		fruits.forEach(System.out::println);
		
		
		
	}
}
