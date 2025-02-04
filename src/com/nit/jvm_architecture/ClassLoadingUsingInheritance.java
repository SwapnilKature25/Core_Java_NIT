package com.nit.jvm_architecture;


//Program that describes whenever we try to load sub class, first of all super class will be loaded. [before parent, child can't exist]

class Alpha
{
	static
	{
		System.out.println("Static Block of super class Alpha!!");
	}
}
class Beta extends Alpha 
{
	static
	{
		System.out.println("Static Block of Sub class Beta!!");
	}
}
class ClassLoadingUsingInheritance 
{
	public static void main(String[] args) 
	{
		 new Beta();
	}
}