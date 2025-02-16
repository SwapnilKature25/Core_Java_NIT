package com.nit.innerclass;


class MyOuter
{
      private int x = 7;
      public void makeInner()
      {
            MyInner in = new MyInner();
			System.out.println("Inner y is "+in.y);
            in.seeOuter();
      }
//      Inner y is 15
//      Outer x is 7
      class MyInner
      {
		    private int y = 15;
            public void seeOuter()
            {
                  System.out.println("Outer x is "+x);
            }
      }
}
public class InnerClassCalling
{
      public static void main(String args[])
      {
            MyOuter m = new MyOuter();
            m.makeInner();   
      } 
}