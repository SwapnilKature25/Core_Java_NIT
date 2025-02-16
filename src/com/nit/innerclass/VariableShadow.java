package com.nit.innerclass;


class Outer2
{
	private int x = 100;
	
	public class Inner
	{
		private int x = 200;
		
		public void access()
		{
			System.out.println("Inner class x variable is :"+this.x);  //200
			System.out.println("Outer class x variable is :"+Outer2.this.x); // 100
		}		
	}	
}

public class VariableShadow {

	public static void main(String[] args) 
	{
		Outer2.Inner in = new Outer2().new Inner();
		in.access();
		
	}

}