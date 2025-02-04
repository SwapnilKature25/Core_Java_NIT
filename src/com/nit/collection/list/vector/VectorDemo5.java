package com.nit.collection.list.vector;


import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo5
{

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahmadabad");
		listOfCity.add("Vanaras");
		
			
		Collections.sort(listOfCity);
		listOfCity.forEach(System.out::println);
		
//		Iterator itr=listOfCity.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		System.out.println(".............");
		
		Vector<Integer> listOfNumbers = new Vector<>();
		listOfNumbers.add(500);
		listOfNumbers.add(900);
		listOfNumbers.add(400);
		listOfNumbers.add(300);
		listOfNumbers.add(800);
		listOfNumbers.add(200);
		listOfNumbers.add(100);	
		
		System.out.println("Original Data...");
		System.out.println(listOfNumbers);
		
		
		System.out.println("Ascending Order...");
		Collections.sort(listOfNumbers);
		System.out.println(listOfNumbers);
		
		
		System.out.println("Descending Order...");
		//sort(List list, Comparator<T> comp);
		Collections.sort(listOfNumbers, Collections.reverseOrder());
		System.out.println(listOfNumbers);
		
		
		//Converting Our Vector(Collection Object) into Array
		Vector<String> listOfFruits = new Vector<>();
		listOfFruits.add("Orange");
		listOfFruits.add("Apple");
		listOfFruits.add("Mango");
		
		
		Collections.sort(listOfFruits);
		System.out.println(listOfFruits);
		
		Object[] obj=listOfFruits.toArray();
		System.out.println(Arrays.toString(obj));
		
		
		
		
		
	}

}