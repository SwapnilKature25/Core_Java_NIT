package com.nit.inheritance;

class Super2
{
	public Super2()
	{		 
		 System.out.println("No argument constructor of Super class");  // 1
	}
	
	public Super2(String str)
	{	
		this();
		System.out.println("My Institute name is :"+str);  // 2
	}
}
class Sub2 extends Super2
{	
   public Sub2()
   {
	  super("NIT");  
	   System.out.println("No argument constructor of sub class");   //3
   }	
}
public class NoArgumentOfCurrentClass {

	public static void main(String[] args) 
	{
		Sub2 s = new Sub2();
	}

}