package com.nit.inheritance;

class Super1
{
	public Super1(String str)
	{	
		System.out.println("My Institute name is :"+str);  // 1
	}
}
class Sub1 extends Super1
{
   public Sub1()
   {
	   super("NIT");
	   System.out.println("No argument constructor of sub class");  //2
   }	
}
public class ParameterizedConstructor {

	public static void main(String[] args) 
	{
		Sub1 s = new Sub1();
	}

}