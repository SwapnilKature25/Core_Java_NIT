package com.nit.multithreading.assignments.mcq;


class Problem13 extends Thread
{
   public static void main(String []argv)
   {
      Thread t = Thread.currentThread();
      System.out.println("Name of current thead : "+t.getName());
      t.setName("First Thread");
      System.out.println("Name of thread after change : "+t.getName());
   } 
}

/* Name of current thead : main
Name of thread after change : First Thread
 */