package com.nit.collection.generics.day1;

class Test<R,A>
{
	private R r;
	public void set(A a) 
	{
//		r = a ;
	}
	
	public R get() 
	{
		return r;
	}
}
public class GenericMCQ3 
{
   public static void main(String[] args) 
   {
      Test<String,String> test = new Test(); 
      test.set("Info");
      System.out.println(test.get());
   }
}

