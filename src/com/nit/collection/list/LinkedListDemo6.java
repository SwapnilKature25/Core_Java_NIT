package com.nit.collection.list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

record Product2(Integer productId, String productName)
{
	
}

public class LinkedListDemo6 {

	public static void main(String[] args)
	{
		List<Product2> listOfProduct = new LinkedList<Product2>();
		listOfProduct.add(new Product2(1, "ApplePhone"));
		listOfProduct.add(new Product2(2, "MiPhone"));
		listOfProduct.add(new Product2(3, "VivoPhone"));
		
		System.out.println("Is list empty :"+listOfProduct.isEmpty());   // false
		
		Iterator<Product2> iterator = listOfProduct.iterator();
		iterator.forEachRemaining(prod -> System.out.println(prod.productName().toUpperCase()));
		
		
		String productName = listOfProduct.get(0).productName();
		System.out.println("1st position product name is :"+productName);  // ApplePhone
	}
}
