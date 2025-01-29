package com.nit.multithreading.assignments.mcq;

public class Problem7 extends Thread
{
	static Thread t;
	public static void main(String [] args)
	{
		try
		{
			t=new Thread(new Problem7(),"Ravi");
			t.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void run()
	{
		for(int i=1; i<5; i++)
		{
			try
			{
				System.out.print(Thread.currentThread().getName()+"");
				t.start();
			}
			catch (Exception e)
			{
				System.out.println(" will not botther about but "+e+" happened "+i+" times");
			}
		}
	}
}


/* Ravi will not botther about but java.lang.IllegalThreadStateException happened 1 times
Ravi will not botther about but java.lang.IllegalThreadStateException happened 2 times
Ravi will not botther about but java.lang.IllegalThreadStateException happened 3 times
Ravi will not botther about but java.lang.IllegalThreadStateException happened 4 times
 */
