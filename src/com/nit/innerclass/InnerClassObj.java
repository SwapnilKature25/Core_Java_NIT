package com.nit.innerclass;

class MyOuter3  
{
      static int x = 7;
	  class MyInner
          {
            public static void seeOuter()  //MyInner.seeOuter();
            {
                  System.out.println("Outer x is "+x);
            }
         }
}

public class InnerClassObj
{
      public static void main(String args[])
      {
//    	  Outer > Inner > seeOuter()
          MyOuter3.MyInner.seeOuter();
      } 
}