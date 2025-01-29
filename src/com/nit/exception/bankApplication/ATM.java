package com.nit.exception.bankApplication;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option : \t1. Deposit \n\t2.Withdraw \n\t3. Transfer \n\t4. Loan Application \n\t5. Check Balance \n\t6. Exit");
		BankAccount ba=new BankAccount(121234,50000);
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1:
				
					System.out.println("Enter amount to Deposit : ");
					double dep=sc.nextDouble();
					try {
						ba.deposit(dep);
					} catch (InvalidAmountException e) {
						e.printStackTrace();
					}
					break;
				
			    

			case 2:
				
					System.out.println("Enter amount to Withdraw : ");
					double wt=sc.nextDouble();
					try {
						try {
							ba.withdraw(wt);
						} catch (InsufficientFundsException e) {
							e.printStackTrace();
						}
					} catch (InvalidAmountException e) {
						e.printStackTrace();
					}
					break;
				
			case 3 :
				
						System.out.println("Enter amount to Withdraw : ");
						double amt3=sc.nextDouble();
					try {
						ba.transfer(ba, amt3);
					} catch (InsufficientFundsException e) {
						e.printStackTrace();
					} catch (AccountNotFoundException e) {
						e.printStackTrace();
					} catch (InvalidAmountException e) {
						e.printStackTrace();
					}				
					break;
					
			default :
				System.out.println("Invalid option");
		}
		
	}
}
