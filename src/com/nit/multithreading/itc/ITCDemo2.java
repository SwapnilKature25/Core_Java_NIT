package com.nit.multithreading.itc;

class Test extends Thread
{
	private int val = 0;  // 1  3  6  10  15  21
	
	@Override
	public void run()
	{
		for(int i=1; i<=100; i++)
		{
			val = val + i;   
		}
		
	}
	
	public int getVal()
	{
		return this.val;
	}
	
	
	
}

public class ITCDemo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main Thread Started...");
       
       Test t1 = new Test();
       t1.start();
       
      Thread.sleep(1);
       
       System.out.println(t1.getVal());
       
       System.out.println("Main Thread ended!!!");
      
	}

}
