package com.nit.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerDesc {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(300);
		al.add(400);
		al.add(100);
		al.add(200);

		Collections.sort(al, (p1,p2)-> p2.compareTo(p1) );
		System.out.println(al);
		

	}

}
