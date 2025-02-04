package com.nit.jvm_architecture;

// 
//Note : All the initializer must be executed normally so we can't write return statement OR any transfer statement.

class StaticBlockDemo7 
{
	static 
	{
      System.out.println("Static Block");
	  return; 
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
}