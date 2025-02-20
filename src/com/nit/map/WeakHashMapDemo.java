package com.nit.map;


import java.util.WeakHashMap;

record Product(Integer id, String name)
{	
	@Override
	public void finalize()
	{
		System.out.println("Product Object is eligible for GC");
	}
	
}

public class WeakHashMapDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Product p1 = new Product(111, "Camera");
		
		WeakHashMap<Product, String> map = new WeakHashMap<>();
		map.put(p1, "Hyderabad");
		
		System.out.println(map);
		
		p1 = null;
		
		System.gc();  //Calling GC explicitly
		
		Thread.sleep(3000);
		
		System.out.println(map); //{}
	

	}
}

/* {Product[id=111, name=Camera]=Hyderabad}
Product Object is eligible for GC */