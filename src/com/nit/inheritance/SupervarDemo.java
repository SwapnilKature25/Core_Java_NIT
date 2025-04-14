package com.nit.inheritance;
class Father
{
	protected double balance = 50000;
	
}
class Daughter extends Father
{
	protected double balance = 18000; //Variable Hiding
	
	public void getBalance()
	{
		System.out.println("Daughter balance is :"+this.balance);  // 18000
		System.out.println("Father balance is :"+super.balance);  // 50000
	}
	
	
}
public class SupervarDemo {

	public static void main(String[] args)
	{
		Daughter d = new Daughter();
		d.getBalance();

	}

}
