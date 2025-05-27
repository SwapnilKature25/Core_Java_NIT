package com.nit.sundayTopics;


class Outerrr
{
  private int x = 100;
  public void m1()
  {
      class Inner
      {
		  int x = 200;

          public void m1()
		  {
			  System.out.println("Inner class value is :"+this.x);  // 200
			  System.out.println("Outer class value is :"+Outerrr.this.x); // 100
		  }
	  }
	  Inner i = new Inner();  
	  i.m1();
  }
	
}
public class MethodLocalInner2 
{	
	public static void main(String[] args) 
	{	 
		Outerrr out = new Outerrr();
	  out.m1();
	}
}