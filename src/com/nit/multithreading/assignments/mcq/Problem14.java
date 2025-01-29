package com.nit.multithreading.assignments.mcq;

class Problem14 extends Thread
{
public void run()
{
System.out.println("PRINT ME");
}
public static void main(String []str)
{
try
{
for(int i=0;i<9;i++)
{
System.out.println(i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("thread exception");
}
Thread t=new Thread();
t.start();
}
}