package com.nit.Encapsulation.NSB;
 
class Alpha
{
	 final int x ; //Blank final field	
	 
	public Alpha()
	{
	   x = 100;
	   System.out.println(x);  //100
	}
	
	public Alpha(int y)
	{
		x = y;
		System.out.println(x);  // 200
	}
	
}
public class BlankFinalFieldDemo2 
{	
	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha(200);
	}
	
}  