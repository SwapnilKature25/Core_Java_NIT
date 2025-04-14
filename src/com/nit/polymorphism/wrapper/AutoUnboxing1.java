package com.nit.polymorphism.wrapper;

//Converting Wrapper object into primitive
public class AutoUnboxing1
{  
 public static void main(String args[])
	   {  
          Integer obj = 15;   //Upto 1.4
			int x = obj.intValue();
			System.out.println(x);
			
			Integer x2 = 25; 
			int y = x2;        //JDK 1.5 onwards  
			System.out.println(y); 
			
			Integer i = 15;
			System.out.println(i.byteValue());
			System.out.println(i.shortValue());
			System.out.println(i.intValue());
			System.out.println(i.longValue());
			System.out.println(i.floatValue());
			System.out.println(i.doubleValue());
			
			Character c1 = 'A';
			char ch = c1.charValue();
			System.out.println(ch);
			
			Boolean b1 = true;
			boolean b = b1.booleanValue();
			System.out.println(b);
		}   
}  