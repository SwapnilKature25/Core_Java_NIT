package com.nit.jvm_architecture;


class Ravi
{
	static
	{
		System.out.println("Static Block of Ravi class");
	}
}

public class ClassLoadingUsingReflectionAPI_FQN 
{ 
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.nit.jvm_architecture.Ravi");
	}

}


// Note : In the above program we will get get java.lang.ClassNotFoundException 
// because Ravi class is not identified by Application class loader, In Eclise IDE 
// Fully Qualified Name (FQN) is reqd.