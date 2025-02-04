package com.nit.jvm_architecture;

class Demo4
{	
    static
	{   
		i = 100;  //valid		
	}

    static int i;
}

public class StaticBlockDemo5
{
    public static void main(String[] args) 
	{
        System.out.println(Demo4.i);
	}
}