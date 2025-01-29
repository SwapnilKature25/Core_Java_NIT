package com.nit.multithreading.assignments.Day2;

class A implements Runnable 
{  
  public void run() 
  {
     System.out.print(Thread.currentThread().getName());
  }  
}  
class B implements Runnable
{  
  public void run() 
  {  
    new A().run();  	// T1
    new Thread(new A(),"T2").run();  // T1
    new Thread(new A(),"T3").start();  // T3 
    /* T1T1T3   => Because in first line A object will call run method directly so it will take the previous thread name
     * 			   in 2nd A is targeting A class run method by calling directly run() so it will also print T1
     * */

   }
}  
public class Problem1
{  
  public static void main (String[] args) 
  {  
    new Thread(new B(),"T1").start();  
  }
}

/* T1T1T3   */
