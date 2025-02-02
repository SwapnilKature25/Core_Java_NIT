package com.nit.interfaces.basics;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		xyz: //labeled loop	// to stop the loop 
//			labled loop => The loop which is declared with 'lable'. we can stop the execution of loop using lable
		while(true)
		{
			System.out.print("Enter the Pin No : ");
			int pinNo=sc.nextInt();
			boolean k=new CheckPinNo().verify(pinNo);
			if(k)
			{
				System.out.println("=======Choice======");
				System.out.println("1. WIthdraw\n2. Deposit");
				System.out.println("Enter the Choice : ");
				switch(sc.nextInt())
				{
				case 1:
					System.out.print("Enter the amount :");
					int a1=sc.nextInt();
					if(a1>0 && a1%100==0)
					{
						new Withdraw().process(a1);
						// Anonymous Object  => it will be destroyed automatically under garbage collection process
					}
					else 
					{
						System.out.println("Invalid amount...");
					}
					break xyz;
				case 2:
					System.out.print("Enter the Amount : ");
					int a2=sc.nextInt();
					if(a2>0 && a2%100==0)
					{
						new Deposit().process(a2);
					}
					else
					{
						System.out.println("Invalid amount");
					}
					break xyz;
				default :
					System.out.println("Invalid Choice..");
					break xyz;
				}
			}
			else 
			{
				System.out.println("Invalid Pin no..");
				count++;
			}
			if(count==3)
			{
				System.out.println("Transaction Blocked...");
				break;	// stop the loop
			}
		}
		
		sc.close();
	}
}
