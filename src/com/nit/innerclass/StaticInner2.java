package com.nit.innerclass;

//Note : We will get error because from static area (static nested inner class) we can't access the non static member directly.

class Outer6
{  
	  int x=15;  //Non static variable

	  static class Inner
	  {  
			void msg() 
			{
				System.out.println("x value is  " + new Outer6().x);
			}
	  }
}
class StaticInner2
{  
	public static void main(String args[])
	{  
		Outer6.Inner obj=new Outer6.Inner();  
		obj.msg();  
	}  
}  