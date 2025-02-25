package com.nit.collection.generics.day1;

import java.util.ArrayList;

class NareshIT<T>
{
	private T test;
	
	public void set(T test)
	{
		this.test = test;
	}
	public T get()
	 {
		 return test;
	 }
}
public class GenericMCQ1 
{
  public static void main(String[] args) 
  {
     NareshIT<Integer> nit = new NareshIT<>();
		nit.set(10);
		System.out.println(nit.get());  //10
   }
}
