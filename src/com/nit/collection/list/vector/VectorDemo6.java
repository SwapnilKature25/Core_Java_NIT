package com.nit.collection.list.vector;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

record Product(int productId, String productName)
{
	
}

public class VectorDemo6
{
	public static void main(String[] args) 
	{
		Vector<Product> listOfProduct = new Vector<>();
		listOfProduct.add(new Product(111, "Laptop"));
		listOfProduct.add(new Product(222, "Mobile"));
		listOfProduct.add(new Product(333, "Camera"));
		listOfProduct.add(new Product(444, "Bag"));
		listOfProduct.add(new Product(555, "Watch"));
		
		Enumeration<Product> ele = listOfProduct.elements();
		
//		ele.asIterator() => it will return iterator with implementation of Anonymous inner class containing hasnext() and next() methods
		Iterator<Product> itr = ele.asIterator();
		itr.forEachRemaining(System.out::println);
		
		
	}

}