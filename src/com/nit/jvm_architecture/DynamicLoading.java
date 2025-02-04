package com.nit.jvm_architecture;

class Foo
{
	static
	{
		System.out.println("It's a static block");
	}
}

public class DynamicLoading {
	public static void main(String[] args) {
		try
		{
//			Class.forName(args[0]);
			Class.forName("Foo");
		}
		catch(ClassNotFoundException e)
		{
			e.getMessage();
//			The main purpose of Exception from realtime industries is to provide some meaninngful messages to the user
			System.out.println("Class is not available... Please Check Again!");
		}
	}
}
