package com.nit.collection.generics.day1;

class NareshIT2<R,A>
{
	private R r;
	public void set(A a) 
	{
		r = (R)a; // casting A to R 
	}
	
	public R get() 
	{
		return r;
	}
}
public class GenericMCQ4 {
	public static void main(String[] args) {		
		
		  NareshIT2<String,String> test = new NareshIT2(); 
		  test.set("52");
		  System.out.println(test.get()); 
	}
}
