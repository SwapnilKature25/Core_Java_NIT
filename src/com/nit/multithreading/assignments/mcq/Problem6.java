package com.nit.multithreading.assignments.mcq;


import java.io.*;
import java.util.*;
class Prime extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==2||i==3||i==5||i==7)
				{
					System.out.println ("Prime No.= "+i);
				}
				Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
class NotPrime extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==4||i==6||i==8||i==9||i==10)
				{
					System.out.println ("Non-Prime No.= "+i);
				}
				Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
class Problem6
{
	public static void main(String args[])
	{
		new Prime().start();
		new NotPrime().start();
	}
}	

/* Prime No.= 2
Prime No.= 3
Non-Prime No.= 4
Prime No.= 5
Non-Prime No.= 6
Prime No.= 7
Non-Prime No.= 8
Non-Prime No.= 9
Non-Prime No.= 10 */
