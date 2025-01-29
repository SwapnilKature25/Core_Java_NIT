package com.nit.exception.bankApplication;

public class InsufficientFundsException extends Throwable{

	public InsufficientFundsException(String msg) throws InsufficientFundsException
	{
		throw new InsufficientFundsException(msg);
	}

}
