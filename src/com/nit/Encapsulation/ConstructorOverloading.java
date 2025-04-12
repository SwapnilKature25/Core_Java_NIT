package com.nit.Encapsulation;


 class Calculate 
{
   public Calculate(int x, int y)
   {
	   System.out.println("Sum of "+x+" and "+y+ " is :"+(x+y));
   }
   
   public Calculate(int x)
   {
	   this(100,200);
	   System.out.println("Square of "+x+" is :"+(x*x));
	   
   }
}


public class ConstructorOverloading 
{
	public static void main(String[] args)
	{
		Calculate c1 = new Calculate(5);
	}

}

// Sum of 100 and 200 is :300
// Square of 5 is :25