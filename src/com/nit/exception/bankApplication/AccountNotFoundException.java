package com.nit.exception.bankApplication;

public class AccountNotFoundException extends Throwable
{
	public AccountNotFoundException(String msg) throws AccountNotFoundException
	{
		throw new AccountNotFoundException(msg);
	}
}
