package com.nit.polymorphism.wrapper;

public class AutoBoxing3 
{
	public static void main(String[] args) 
	{
			Integer a = Integer.valueOf(15);
			
			Integer b = Integer.valueOf("25");

            Integer c = Integer.valueOf("111",36); //Here Base we can take upto 36

			System.out.println(a);	//15
			System.out.println(b);	//25
			System.out.println(c);	//1333
			
           
			Integer i1 = new Integer(100);
			Integer i2 = new Integer(100);
			System.out.println(i1==i2);

			Integer a1 = Integer.valueOf(15);
			Integer a2 = Integer.valueOf(15);
			System.out.println(a1==a2);
	}
}