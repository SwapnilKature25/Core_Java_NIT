package com.nit.sundayTopics;

import java.lang.reflect.Method;

//Note : Method Local inner class will be accessible within the same method body only.

class Outer2
{
   private int x = 100;

  public void m1()
  {
      class Inner
      {
		  int x = 200;

	  public void m1()
		  {
			  System.out.println("Inner class value is :"+this.x);
			  System.out.println("Outer class value is :"+Outer2.this.x);
		  }
	  } 
  }
//   Inner i = new Inner();    // we can't access method/local inner class outside of the method body
//	  i.m1();
	
}
public class MethodLocalInner3 
{	
	public static void main(String[] args) 
	{	 
	  Outer2 out = new Outer2();
	  out.m1();
	}
}
