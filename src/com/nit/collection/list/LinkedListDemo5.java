package com.nit.collection.list;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo5 {

	public static void main(String[] args) 
	{	
		
		
		List<String> listOfName = Arrays.asList("Ravi","Rahul","Ankit", "Rahul");
		listOfName.set(1, "Rohan");   // valid we can only replaced the value of asdList() but we can't add and remove any element as it is fixed length array 
//		listOfName.add("new");   // UnsupportedOperationException
//		listOfName.remove(1);  // UnsupportedOperationException
		
		LinkedList<String> list = new LinkedList<>(listOfName); 
		list.forEach(System.out::println);
		       
	}

}