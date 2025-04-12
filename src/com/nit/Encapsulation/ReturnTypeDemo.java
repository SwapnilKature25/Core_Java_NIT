package com.nit.Encapsulation;


public class ReturnTypeDemo 
{  
	public ReturnTypeDemo()
	{
		System.out.println("ReturnTypeDemo constructor");
	}
	public ReturnTypeDemo accept()
	{
//		return this;
//		   OR
//		 return null;
//		   OR
		 return new ReturnTypeDemo();
	}
	
	public static void main(String[] args) {
		ReturnTypeDemo r=new ReturnTypeDemo();
		System.out.println(r.accept());
		
		
	}
}
