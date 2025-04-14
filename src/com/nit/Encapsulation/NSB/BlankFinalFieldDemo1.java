package com.nit.Encapsulation.NSB;

class Test3
{
	final int x; //blank final field
	
	{
		m1();
		x = 100;
	}
	
	public void m1()
	{
		System.out.println("Default value :"+x);    // 0
	}	
	
}

public class BlankFinalFieldDemo1 {

	public static void main(String[] args)
	{
		Test3 t1 = new Test3();
		System.out.println("User Value :"+t1.x);   // 100

	}

}
