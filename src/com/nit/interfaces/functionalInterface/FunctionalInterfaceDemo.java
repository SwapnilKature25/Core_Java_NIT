package com.nit.interfaces.functionalInterface;


@FunctionalInterface
public interface FunctionalInterfaceDemo 
{	

   void print();  //[SAM = Single Abstract Method]
   
   default void m1()
   {
	   
   }
   
   static void m3()
   {
	   
   }
  
}
