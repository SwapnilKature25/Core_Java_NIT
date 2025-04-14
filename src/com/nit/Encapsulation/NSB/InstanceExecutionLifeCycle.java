package com.nit.Encapsulation.NSB;

class Test2
{
	int x = 100;   //STEP 1
	
	{
		x = 200;  //STEP 2
	}
	
	Test2()
	{
		
		x = 300; //STEP 3
	}	
	
}


public class InstanceExecutionLifeCycle 
{
	public static void main(String[] args) 
	{
		Test2 t1 = new Test2(); 
		System.out.println(t1.x); //300

	}

}