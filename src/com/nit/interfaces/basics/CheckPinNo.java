package com.nit.interfaces.basics;

public class CheckPinNo {
	public void checkPinNo(int pin)
	{
		int count=0;
		for(int i=1; i<=3; i++)
		{
			if(pin != 1111 || pin != 2222 || pin != 3333)
			{
				count++;
			}
		}
		
		if(count <= 3 )
		{
			if(pin == 1111 || pin == 2222 || pin == 3333)
			{
				
			}
			else {
				System.out.println("Invalid Pin No");
			}
		}
		else {
			System.out.println("Transactions Blocked");
		}
	}
}
