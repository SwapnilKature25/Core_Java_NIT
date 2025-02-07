package com.nit.collection.list;

/* 
In the above program we will get java.util.ConcurrentModificationException because 
Iterator is Fail Fast iterator hence while iterating the element if the structure 
will be modified then exception will be generated. */

import java.util.Iterator;
import java.util.Vector;

class Concurrent extends Thread
{
	private Vector<String> cities = null;
		
	public Concurrent(Vector<String> cities) 
	{
		super();
		this.cities = cities;
	}

	@Override
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
//		If we dont add new city then it will not throw concurrentModificationException 
		cities.add("Ameerpet");
		
	}
}


public class FailFastIterator {

	public static void main(String[] args) throws InterruptedException
	{
		Vector<String> cityName = new Vector<>();
		cityName.add("Indore");
		cityName.add("Bhubneswar");
		cityName.add("Hyderabad");
		cityName.add("Mumbai");
		cityName.add("Pune");

		Concurrent c1 = new Concurrent(cityName);
		c1.start();
		
		Iterator<String> itr = cityName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(500);
		}
		
		
	}

}
