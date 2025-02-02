package com.nit.interfaces.basics;

public class Withdraw implements Transaction
{
	@Override
	public void process(int amt) {
		if(amt <= b.balance)
		{
			System.out.println("Amount WithDrawn : "+amt);
			b.balance=b.balance-amt;
			b.getBalance();
			System.out.println("Transaction completed....");
		}else {
			System.out.println("Insufficient Fund...");
		}
	}
	
	
}
