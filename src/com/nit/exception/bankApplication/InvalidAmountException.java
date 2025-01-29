package com.nit.exception.bankApplication;

public class InvalidAmountException extends Throwable
{
	public InvalidAmountException(String msg) throws InvalidAmountException
	{
		throw new InvalidAmountException(msg);
	}
}
