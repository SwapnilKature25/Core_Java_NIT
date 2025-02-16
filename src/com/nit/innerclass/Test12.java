package com.nit.innerclass;

class Outer3
{  
	  static int x = 15;  

		static class Inner 
		{
			void msg() 
			{
				System.out.println("x value is  " + x);
			}
		}
}
class Test12
{  
	public static void main(String args[])
	{  
		Outer3.Inner obj=new Outer3.Inner();  
		obj.msg();  
	}  
}  
