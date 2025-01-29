package com.nit.multithreading;
import java.util.Scanner;
import java.util.InputMismatchException;
class BatchAssignments extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		if(name != null && name.equalsIgnoreCase("Placement"))
		{
			this.placementBatch();
		}else if(name != null && name.equalsIgnoreCase("regular"))
		{
			this.regularBatch();
		}
		else {
			throw new NullPointerException("Name can't be null");
		}
	}
	
	public void placementBatch()
	{
		System.out.println("I am a placement batch student.");
	}
	
	public void regularBatch()
	{
		System.out.println("I am a Regular Batch student.");
	}
	
}

public class ThreadName2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		try(sc)
		{
			System.out.println("Enter your Batch Title : ");
			String title=sc.next();
			
			BatchAssignments ba=new BatchAssignments();
			ba.setName(title);
			ba.start();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		
		
	}

}
