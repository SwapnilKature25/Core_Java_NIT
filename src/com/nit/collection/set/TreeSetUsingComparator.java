package com.nit.collection.set;

//How to sort TreeSet by using Comparator :

import java.util.TreeSet;

record Product(Integer id, String name) 
{
	
	
}

public class TreeSetUsingComparator {

	public static void main(String[] args)
	{
		TreeSet<Product> ts1 = new TreeSet<Product>((p1, p2)->p1.name().compareTo(p2.name()) );
        ts1.add(new Product(333, "Laptop"));
        ts1.add(new Product(111, "Mobile"));
        ts1.add(new Product(222, "Camera"));
        
        System.out.println(ts1);
	}

}