package com.nit.jvm_architecture;

class Test2
{   
	public static final Test2 t1 = new Test2(); //t1 = null
	
    static
	{
	   System.out.println("static block");
	}

	{
	   System.out.println("Non static block");
	}

	Test2()
	{
		System.out.println("No Argument Constructor");
	}
	
}

public class StaticBlockDemo9 
{
	public static void main(String[] args) 
	{
		new Test2();  //2 steps (class loading + Object creation)
	}
}