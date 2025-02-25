package com.nit.collection.generics;

import java.util.*;
class Parent11
{

}
class Child extends Parent11
{
	
}
public class WildCardDemo4
{
public static void main(String [] args)
	{	
		ArrayList<?> lp = new ArrayList<Parent11>();
		System.out.println("Wild card....");
	}
}