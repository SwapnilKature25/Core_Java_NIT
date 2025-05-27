package com.nit.sundayTopics;


//Writing constructor in enum

//Every time enum object will be created, appropriate constructor will be executed.

enum Season
{
	WINTER, SUMMER, SPRING, RAINY, FALL;   //All are object of type enum
	 
	private Season()
	{
		System.out.println("Constructor is executed....");
	}	
}
class EnumDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println(Season.WINTER);
		System.out.println(Season.SUMMER);
		
	}
}

