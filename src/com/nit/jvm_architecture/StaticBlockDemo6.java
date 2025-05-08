package com.nit.jvm_architecture;

class Demo42
{
    static 
	{   
		i = 100;
		//System.out.println(i);  //Invalid
		System.out.println(Demo42.i); //Valid
    }

    static int i;
}

public class StaticBlockDemo6
{

    public static void main(String[] args) 
	{
		System.out.println(Demo42.i);
	}
}