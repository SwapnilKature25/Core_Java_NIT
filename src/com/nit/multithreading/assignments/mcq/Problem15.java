package com.nit.multithreading.assignments.mcq;

class Foo implements Runnable
{
public void run() 
{
for(int i=0;i<3;i++)
System.out.println("Run by..."+Thread.currentThread().getName()+",i Is "+ i);
}
public void run(String name)
{
System.out.println("This is Second"+name);
}
}
public class Problem15
{
public static void main(String args [])
{
Foo f = new Foo();
Thread t = new Thread(f);
t.start();
try 
{
System.out.println("Number Will be printt After 500 MiliSecond..");
for(int j=0;j<5;j++)
{
System.out.println("This is j..."+j);
t.sleep(500);
}
}
catch(InterruptedException e) 
{
System.out.println("InterruptedException.."+ e);
e.printStackTrace();
}
}
}


/* Number Will be printt After 500 MiliSecond..
This is j...0
This is j...1
This is j...2
This is j...3
This is j...4
 */
