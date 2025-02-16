package com.nit.innerclass;
 
class Outer10
{
   private int x = 100;

  public void m1()
  {
      class Inner
      {
		  int x = 200;

          public void m1()
		  {
			  System.out.println("Inner class value is :"+this.x);  //200
			  System.out.println("Outer class value is :"+Outer10.this.x); //100
		  }
	  }
	  Inner i = new Inner();  
	  i.m1();
  }
   
	
}
public class MethodLocalInnerClass2 
{	
	public static void main(String[] args) 
	{	 
	  Outer10 out = new Outer10();
	  out.m1();
	}
}