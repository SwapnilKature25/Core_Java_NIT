package com.nit.sundayTopics;

class Outers
{
	private int x = 100;

	
	public class Inner
	{
		private int x = 200;
		
		public void access()
		{
			System.out.println("Inner class x variable is :"+this.x);  // 200
			System.out.println("Outer class x variable is :"+Outers.this.x);  // 100
		}		
	}	
}

public class VariableShadow {

	public static void main(String[] args) 
	{
		Outers.Inner in = new Outers().new Inner();
		in.access();
		
	}

}