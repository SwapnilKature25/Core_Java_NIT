package com.nit.innerclass;

class MyOuter2
{
      private int x = 15;
      class MyInner
      {
            public void seeOuter()
            {
                  System.out.println("Outer x is "+x);
            }
      }
}
public class InnerObjectOneLine
{
      public static void main(String args[])
      {
		  //Creating inner class object in a single line
           MyOuter2.MyInner m = new MyOuter2().new MyInner();
			m.seeOuter();
      } 
