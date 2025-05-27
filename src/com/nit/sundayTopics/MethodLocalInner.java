package com.nit.sundayTopics;


//program on method local inner class
class Outerr
{
    private String x = "Outer class private data";

    public void doSttuff()
    { 
         String z = "local variable";  

         class MyInner  //Only final and abstract applicable
         {
               public void seeOuter()
               {
                    System.out.println("Outer x is "+x);
                    System.out.println("Local variable z is : "+z);
               }
         }
		  MyInner mi = new MyInner();
          mi.seeOuter();
	   
    }	   
	 
}
public class MethodLocalInner
{
    public static void main(String args[])
    {
    	Outerr m = new Outerr();
          m.doSttuff();  
    } 
}