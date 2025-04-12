package com.nit.Encapsulation;

public class PassByValueDemo
{
	public static void main(String[] args) 
	{
		int x = 100;
		x = accept(x);
		System.out.println(x);
	}

	public static int accept(int y)
	{
		y = 200;
		return y;
	}
}