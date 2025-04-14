package com.nit.inheritance;

class Alpha
{
	public String doString()
	{
		return "India";
	}
}
class Beta extends Alpha
{
	public String toString() //Method Overriding
	{
		System.out.println(super.doString());
		return "Hyderabad";
	}
}
public class SuperMethodCall 
{	
	public static void main(String[] args) 
	{
		Beta b = new Beta();
		System.out.println(b.toString());
	}
}  
