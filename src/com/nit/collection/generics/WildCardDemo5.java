package com.nit.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo5 
{
	public static void main(String[] args) 
	{
		List<? extends Number> list1 = new ArrayList<Long>();

		List<? super String> list2 = new ArrayList<Object>();

		List<? super Gamma> list3 = new ArrayList<Alpha>();

		List list4 = new ArrayList();
		
		System.out.println("yes");
	}
}

class Alpha
{
}
class Beta extends Alpha
{
}
class Gamma extends Beta
{
}