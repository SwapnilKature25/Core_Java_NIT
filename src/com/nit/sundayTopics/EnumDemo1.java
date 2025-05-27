package com.nit.sundayTopics;
 

enum Bird
{	
	PARROT, SPARROW, PEACOCK;  //public static final Bird PARROT = new Bird();		
}

public  class EnumDemo1 
{	
	public static void main(String[] args) 
	{ 			
		System.out.println(Bird.PEACOCK);
		
		enum Month
		{
			JANUARY, FEBRUARY,MARCH     //public + static + final
		}

		System.out.println(Month.MARCH);   // We can write an enum inside a method.
		  
    }  
	
}