package com.nit.inheritance;

class Alpha1
{
	public Alpha1()
	{
		super();
		System.out.println("Alpha class");
	}
}
class Beta1 extends Alpha1
{
	public Beta1()
	{
//		super();
		System.out.println("Beta class");
	}
}
public class CallingNoArgument 
{	
	public static void main(String[] args) 
	{
		Beta1 b = new Beta1();
		
	}
	
}  

//Alpha class
//Beta class