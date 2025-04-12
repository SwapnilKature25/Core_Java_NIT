package com.nit.abstraction;
class Alpha
{
	private final void accept()
	{
		System.out.println("Alpha class accept method");
	}
}
class Beta extends Alpha
{
	protected void accept()
	{
		System.out.println("Beta class accept method");
	}
}
public class FinalMethodEx 
{
	public static void main(String [] args) 
	{
		new Beta().accept();
	}
}