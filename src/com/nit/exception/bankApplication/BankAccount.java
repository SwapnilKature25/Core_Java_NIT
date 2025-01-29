package com.nit.exception.bankApplication;

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	
	
	public BankAccount(long accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance= balance;
	}
	
	public void deposit(double amount) throws InvalidAmountException 
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("Invalid Amount");
		}
		else {
			balance+=amount;
			System.out.println("Balance Credited with "+amount+"\nTotal Balance : "+balance);
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException
	{
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient Amount");
		}
		else if(amount <= 0){
			throw new InvalidAmountException("Invalid Amount");
		}
		else {
			balance-=amount;
			System.out.println(amount+" from your account Debited "+"\nTotal Balance : "+balance);
		}
	}
	
	
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException
	{
		
		if(amount > balance)
		{
			throw new InsufficientFundsException("Insufficient Amount");
		}
		else if(amount <= 0){
			throw new InvalidAmountException("Invalid Amount");
		}
		else if(toAccount == null)
		{
			throw new AccountNotFoundException("Account not found");		
		}
		else {
//			toAccount =amount;
		}
	}
	
	
	public void applyForLoan(double amount)throws  LoanNotAllowedException, InvalidAmountException
	{
		 if(amount <= 0){
				throw new InvalidAmountException("Invalid Amount");
			}
			else if(amount > 50000)
			{
				throw new LoanNotAllowedException("Loan exceeds the limit");		
			}
			else {
				System.out.println("Loan approved of "+ (amount));
			}
	}
	
	
	public double getBalance()
	{
		return balance;
	}
	
	
}
