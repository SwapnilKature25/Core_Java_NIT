package com.nit.collection.list;

import java.util.Vector;

record Prod(Integer id, String name)
{
	
}

public class VectorDemo3
{
	public static void main(String[] args) 
	{
	  	Vector<Prod> listOfProduct = new Vector<>();
	  	listOfProduct.add(new Prod(333, "Mobile"));
	  	listOfProduct.add(new Prod(111, "Camera"));
	  	listOfProduct.add(new Prod(222, "Laptop"));
	  	listOfProduct.add(new Prod(444, "Tablet"));
	  	
	  	listOfProduct.forEach(System.out::println);
	}
}

/* Prod[id=333, name=Mobile]
Prod[id=111, name=Camera]
Prod[id=222, name=Laptop]
Prod[id=444, name=Tablet] */