package com.nit.polymorphism.wrapper;

class Test3
{
	public void accept(byte d)  
	{
		System.out.println("byte");
	}
	public void accept(short s)  
	{
		System.out.println("short");
	}	
}
public class AmbiguityIssue3 {

	public static void main(String[] args) 
	{
		Test3 t1 = new Test3();
//		t1.accept(15);  //error
		t1.accept((byte)15);   // byte
		t1.accept((short)15);  // short
	}
}