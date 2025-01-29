package com.nit.exception.bankApplication;

public class LoanNotAllowedException extends Throwable
{
	public LoanNotAllowedException(String msg) throws LoanNotAllowedException
	{
		throw new LoanNotAllowedException(msg);

	}
}
