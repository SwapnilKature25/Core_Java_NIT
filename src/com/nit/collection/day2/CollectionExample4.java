package com.nit.collection.day2;

import java.util.ArrayList;

public class CollectionExample4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
//		for(int i=0;i<10;i++) 
//		{
//			al.add(i);
//		}
//		for(int str: al)
//			System.out.print(str+" ");
		
		
		
		for(int i=5;i<10;i++) 
		{
			al.add(i);		// 5 6 7 8 9 
		}
		al.remove(4);
		for(int str: al)
			System.out.print(str+" ");  // 5 6 7 8

	}
}