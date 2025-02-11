package com.nit.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

record Product(Integer id, String name) 
{

}



public class ProductComparator {

	public static void main(String[] args) 
	{
		ArrayList<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(333, "Laptop"));
		listOfProduct.add(new Product(111, "Mobile"));
		listOfProduct.add(new Product(222, "Camera"));
		
		System.out.println("Original Data :");
		listOfProduct.forEach(System.out::println);
		System.out.println();	
		
		System.out.println("Sorted Data based on the Id in Ascending order :");
		Collections.sort(listOfProduct, (p1,p2) -> p1.id().compareTo(p2.id()));		
		listOfProduct.forEach(System.out::println);
		System.out.println("Sorted Data based on the Id in Descending order :");
		Collections.sort(listOfProduct, (p1,p2) -> p2.id().compareTo(p1.id()));
		listOfProduct.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Sorted Data based on the Name :");
		Collections.sort(listOfProduct, (p1,p2)-> p1.name().compareTo(p2.name()));
		listOfProduct.forEach(System.out::println);

	}

}
