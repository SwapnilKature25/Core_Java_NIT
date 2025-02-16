package com.nit.innerclass;

//Note : Method Local inner class will be accessible within the same method body only.

class Outer11
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
			  System.out.println("Outer class value is :"+Outer.this.x);
		  }
	  } 
  }
   Inner i = new Inner();   //can't be accessible outside of the method 
	  i.m1();
	
}
public class MethodLocalInnerClass3 
{	
	public static void main(String[] args) 
	{	 
	  Outer11 out = new Outer11();
	  out.m1();
	}
}
