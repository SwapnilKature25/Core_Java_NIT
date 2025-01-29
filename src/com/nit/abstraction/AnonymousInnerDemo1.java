package com.nit.abstraction;


//Program on Anonymous inner class using Concrete class :
//-------------------------------------------------------

class Super
{
	public void show()
	{
		System.out.println("Super class show method");
	}
}
public class AnonymousInnerDemo1 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Super sub = new Super()
		{
			@Override
			public void show()
			{
				System.out.println("Sub class show method");
			}
		};
		
		sub.show();
	}

}
