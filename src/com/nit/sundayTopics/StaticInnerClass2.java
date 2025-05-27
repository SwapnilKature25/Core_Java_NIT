package com.nit.sundayTopics;

//We can static static member of Outer class.
class Outercls
{  
	  static int x = 15;  

	  static class Inner
	  {  
			    void msg()
				{
					System.out.println("x value is  "+x);
				}  
	  }
}
class StaticInnerClass2
{  
	public static void main(String args[])
	{  
		Outercls.Inner obj=new Outercls.Inner();  
		obj.msg();  
	}  
}  

