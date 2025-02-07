package com.nit.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfDemo {

	public static void main(String[] args) 
	{
		
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Raj");
		listOfNames.add("Rohit");
		listOfNames.add("Rohan");
		listOfNames.add("Ankit");
		listOfNames.add("Scott");
		
		System.out.println("Original List :"+listOfNames);
		
		//Remove all the name which starts from character 'R'
		
		listOfNames.removeIf(str -> str.startsWith("R"));   
//		listOfNames.removeIf(str -> str.contains("Ankit"));  // Original List :[Raj, Rohit, Rohan, Scott]
		System.out.println("After removing :"+listOfNames);
		
	}

}