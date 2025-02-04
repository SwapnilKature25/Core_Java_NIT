package com.nit.jvm_architecture;


class Demo6
{
   static
   {
       System.out.println("static block");
   }
}
public class ClassLoadingUsingReflectionAPI
{
   public static void main(String [] args) throws ClassNotFoundException
   {
//       Class.forName("Demo6");	// not valid in eclipse
       Class.forName("com.nit.jvm_architecture.Demo6");
   }
}

/* 
Note : In the above program we will get get java.lang.ClassNotFoundException because
 Ravi class is not identified by Application class loader, In Eclise IDE Fully 
 Qualified Name is reqd. */