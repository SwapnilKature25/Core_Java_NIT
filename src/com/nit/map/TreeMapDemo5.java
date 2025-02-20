package com.nit.map;


import java.util.TreeMap;

record Product2(Integer pid, String pname)
{
	
}
public class TreeMapDemo5
{
	public static void main(String[] args)
	{
		TreeMap<Product2,String> tm1 = new TreeMap<>((p1, p2)-> p1.pid().compareTo(p2.pid()));
		tm1.put(new Product2(333, "Laptop"), "Hyderabad");
		tm1.put(new Product2(444, "Mobile"), "Pune");
		tm1.put(new Product2(111, "HeadPhone"), "Indore");
		tm1.put(new Product2(222, "Camera"), "Mumbai");

		System.out.println("Sorting based on the Product Id in Ascending Order");
		tm1.forEach((k,v)-> System.out.println(k+" : "+v));
		
		TreeMap<Product2,String> tm2 = new TreeMap<>((p1, p2)-> p2.pid().compareTo(p1.pid()));
		tm2.put(new Product2(333, "Laptop"), "Hyderabad");
		tm2.put(new Product2(444, "Mobile"), "Pune");
		tm2.put(new Product2(111, "HeadPhone"), "Indore");
		tm2.put(new Product2(222, "Camera"), "Mumbai");

		System.out.println("Sorting based on the Product Id in Descending Order");
		tm2.forEach((k,v)-> System.out.println(k+" : "+v));
	}

}