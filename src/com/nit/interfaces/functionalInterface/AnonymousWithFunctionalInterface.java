package com.nit.interfaces.functionalInterface;

//Functional interface by using Anonymous inner class :
//------------------------------------------------------

@FunctionalInterface
interface Payment
{
	void makePayment();
}
public class AnonymousWithFunctionalInterface {

	public static void main(String[] args) 
	{
//		Payment p=new Payment();	//Cannot instantiate the type Payment
		Payment creditCard = new Payment() 
		{			
			@Override
			public void makePayment() 
			{
				System.out.println("Making payment through Credit Card");				
			}
		};
		
		Payment debitCard = new Payment() 
		{			
			@Override
			public void makePayment() 
			{
				System.out.println("Making payment through Debit Card");				
			}
		};
		creditCard.makePayment();
		debitCard.makePayment();

	}
	
	/* Making payment through Credit Card
Making payment through Debit Card
 */

}