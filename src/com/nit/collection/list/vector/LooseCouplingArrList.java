package com.nit.collection.list.vector;

//Program on loose coupling :

import java.util.ArrayList;
import java.util.Vector;

public class LooseCouplingArrList {

	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(12);
		v1.add(29);
		v1.add(59);
		v1.add(24);
		
		ArrayList<Integer> list = new ArrayList<>(v1);		
		System.out.println(list);
		
		
	}

}