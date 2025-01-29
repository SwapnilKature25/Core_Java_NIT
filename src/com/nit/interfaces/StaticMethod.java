package com.nit.interfaces;


interface Calculate 
{
   static double getSquare(int num)  //JDK 1.8 [by default public]
   {
	  
	   return num*num;
   }
   
   static double getCube(int num)  
   {
	   return num*num*num;
   }
}

//class B1 implements Calculate
//{
//	@Override
//	void getSquare(int num)
//	{
//		
//	}
//}

public class StaticMethod {

	public static void main(String[] args) 
	{
		System.out.println("Square is :"+Calculate.getSquare(12));
		System.out.println("Cube is :"+Calculate.getCube(12));

	}

}