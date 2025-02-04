package com.nit.collection.list.vector;

//Vector Program on capacity

import java.util.*;

public class VectorDemo2 {
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>(100,9); 
		
		System.out.println("Initial capacity is :" + v.capacity());

		for (int i = 0; i < 100; i++) 
		{
			v.add(i);
		}

		System.out.println("After adding 100 elements  capacity is :" + v.capacity()); 
		
		v.add(101);
		System.out.println("After adding 101th elements  capacity is :" + v.capacity());

		for(int i=0; i<v.size(); i++)
		{
			if(i%5==0)
			{
				System.out.println();
			}
			System.out.print(v.get(i)+"\t");
		}

		
	}
}