package com.nit.collection.generics;

import java.util.ArrayList;

public class WildCardDemo2 {
	class Parent
	{
	}
	class Child extends Parent
	{
	}

	public class Test11
	{
	public static void main(String [] args)
		{	
			//ArrayList<Parent> lp = new ArrayList<Child>(); //error
			
			ArrayList<?> lp = new ArrayList<Child>(); 

			ArrayList<Parent> lp1 = new ArrayList<Parent>(); 

			ArrayList<Child> lp2 = new ArrayList<>(); 

			System.out.println("Success");
		}
	}
}
