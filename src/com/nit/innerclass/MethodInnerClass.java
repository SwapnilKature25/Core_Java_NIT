package com.nit.innerclass;

class Foo
{
	public void m1()
	{
//		public int x;  //Illegal modifier for parameter x; only final is permitted
		final int x;	//valid
//		public class MethodL   //Illegal modifier for the local class MethodL; only abstract or final is permitted
//		abstract class MethodL {}   // valid but object will not be created			
		final class MethodL    // valid		
		{
			
		}
	}
}

public class MethodInnerClass {
	public static void main(String[] args) {
		
	}
}
