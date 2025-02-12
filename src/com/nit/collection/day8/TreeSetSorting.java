package com.nit.collection.day8;

import java.util.TreeSet;

record Product(Integer pid,String pname)
{
	Product
	{
		if(pid <= 0)
		{
			throw new IllegalArgumentException("Zero or -ve value not allowed...");
		}
	}
}

public class TreeSetSorting {
	public static void main(String[] args) {
		TreeSet<Product> products=new TreeSet<>((p1,p2)->p1.pid().compareTo(p2.pid()));
		products.add(new Product(122,"Mobile"));
		products.add(new Product(111,"Laptop"));
		products.add(new Product(133,"Apple"));
		System.out.println("Sorting based on id in ascending order");		
		products.forEach(System.out::println);
		
		System.out.println();
		
//		TreeSet<Product> product2=new TreeSet<>((p1,p2)->Integer.compare(p2.pid(), p1.pid()));
		TreeSet<Product> product2=new TreeSet<>((p1,p2)->-(p1.pid()-p2.pid()));
		product2.add(new Product(122,"Mobile"));
		product2.add(new Product(111,"Laptop"));
		product2.add(new Product(133,"Apple"));
		System.out.println("Sorting based on id in descending order");		
		product2.forEach(System.out::println);
		System.out.println();

		
		TreeSet<Product> product3=new TreeSet<>((p1,p2)->p1.pname().compareTo(p2.pname()));
		product3.add(new Product(122,"Mobile"));
		product3.add(new Product(111,"Laptop"));
		product3.add(new Product(133,"Apple"));
		System.out.println("Sorting based on name in ascending order");		
		product3.forEach(System.out::println);
		System.out.println();

		
		TreeSet<Product> product4=new TreeSet<>((p1,p2)->p2.pname().compareTo(p1.pname()));
		product4.add(new Product(122,"Mobile"));
		product4.add(new Product(111,"Laptop"));
		product4.add(new Product(133,"Apple"));
		System.out.println("Sorting based on name in descending order");		
		product4.forEach(System.out::println);
		System.out.println();
		
		
		
		
		
		
	}
}
