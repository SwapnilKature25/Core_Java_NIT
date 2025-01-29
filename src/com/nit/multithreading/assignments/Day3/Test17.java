package com.nit.multithreading.assignments.Day3;


class TestCase4 implements Runnable
{
	public void run()
	{
		for(int i=0; i<2; i++)
		{
		System.out.println(Thread.currentThread().getName()+" ");
		}
		System.out.println();
	}
}
class Test17
{
	public static void main(String[] args) 
	{
		TestCase4 t = new TestCase4();
		Thread t1 = new Thread();
		Thread t2 = new Thread(t,"J2EE");
		Thread t3 = new Thread(t,"J2ME");
		t1.start();t2.start();t3.start();

	}
}
/* 
When t1.start() is called, the run() method of Thread itself is executed.
The Thread class's default run() method does nothing
public void run() {
    if (target != null) {
        target.run();
    }
}
Since t1 does not have a Runnable target (target is null), the run() method does nothing, and no output is produced by t1.

J2EE 
J2EE 

J2ME 
J2ME 

 */
