package com.nit.map;


import java.util.HashMap;
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
		
//		HashMap<Product,String> hm=new HashMap<>();
//		hm.put(p1, "Pune");
		
		System.out.println(map);
//		System.out.println(hm);
		
		p1 = null;
		
		System.gc();  //Calling GC explicitly
		
		Thread.sleep(3000);
		
		System.out.println(map); //{}
	

	}
}

/* {Product[id=111, name=Camera]=Hyderabad}
Product Object is eligible for GC */