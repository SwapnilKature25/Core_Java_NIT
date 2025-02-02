package com.nit.interfaces.basics;

public class Deposit implements Transaction
{

	@Override
	public void process(int amt) {
		System.out.println("Amt Deposited : "+amt);
		b.balance+=amt;
		b.getBalance();
		System.out.println("Transaction Completed...");
	}
	
}
