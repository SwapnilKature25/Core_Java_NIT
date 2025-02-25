package com.nit.collection.generics.day1;

class Test2<R,A>
{
	private R r;
	private A a;
	public void set(A a, R r) //method 
	{
		this.a = a;
		this.r = r;
	}
	
	public String get() 
	{
		String str = a.toString()+r.toString();
		return str;
//		r = a+r; 
//		return r;
	}
}

public class GenericMCQ5 
{
  public static void main(String[] args) 
  {

		  Test2<String,String> test = new Test2(); 
		  test.set("Naresh I ","Technologies");
		  System.out.println(test.get());  // Naresh I Technologies

  }
}
