package com.nit.collection.list;


//Array To Collection
import java.util.*;
public class VectorArrayToCollection
{
	public static void main(String args[])
	{
		Vector<Integer> v = new Vector<>();  
		
		int x[]={22,20,10,40,15,58};

       //Adding array values to Vector
		for(int i=0; i<x.length; i++)
		{
			v.add(x[i]);
		}		
		Collections.sort(v);
		System.out.println("Maximum element is :"+Collections.max(v));
		System.out.println("Minimum element is :"+Collections.min(v));
		
		System.out.println("Vector Elements :");
//		forEach() 
		v.forEach(y -> System.out.println(y));
		
		System.out.println(".....................");
		Collections.reverse(v);
		v.forEach(y -> System.out.println(y));
		
		//Vector to Array
		 Object[] array = v.toArray();
		System.out.println("Vector to array");
		System.out.println(Arrays.toString(array));
		
	}
}