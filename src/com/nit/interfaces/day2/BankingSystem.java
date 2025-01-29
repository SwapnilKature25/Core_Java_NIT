package com.nit.interfaces.day2;

//Customer Class
class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public void deposit(Bank bank, double amount) {
		System.out.println(name + " is depositing ₹" + amount);
		bank.deposit(amount);
	}

	public void withdraw(Bank bank, double amount) {
		System.out.println(name + " is withdrawing ₹" + amount);
		bank.withdraw(amount);
	}

	public void checkBalance(Bank bank) {
		System.out.println(name + "'s account balance: ₹" + bank.checkBalance());
	}
}

//Main class to test the banking system
public class BankingSystem {
	public static void main(String[] args) {
		// Create instances of banks with an initial balance
		Bank sbi = new SBI(5000);
		Bank hdfc = new HDFC(8000);
		Bank icici = new ICICI(7000);

		// Create a customer
		Customer customer = new Customer("Rahul");

		// Customer interacts with SBI
		customer.deposit(sbi, 2000);
		customer.withdraw(sbi, 3000);
		customer.checkBalance(sbi);

		System.out.println();

		// Customer interacts with HDFC
		customer.deposit(hdfc, 5000);
		customer.withdraw(hdfc, 12000); // This should show insufficient balance
		customer.checkBalance(hdfc);

		System.out.println();

		// Customer interacts with ICICI
		customer.withdraw(icici, 2500);
		customer.checkBalance(icici);
	}
}

/* Rahul is depositing ?2000.0
Deposited ?2000.0 in SBI. New Balance: ?7000.0
Rahul is withdrawing ?3000.0
Withdrawn ?3000.0 from SBI. New Balance: ?4000.0
Rahul's account balance: ?4000.0

Rahul is depositing ?5000.0
Deposited ?5000.0 in HDFC. New Balance: ?13000.0
Rahul is withdrawing ?12000.0
Withdrawn ?12000.0 from HDFC. New Balance: ?1000.0
Rahul's account balance: ?1000.0

Rahul is withdrawing ?2500.0
Withdrawn ?2500.0 from ICICI. New Balance: ?4500.0
Rahul's account balance: ?4500.0
 */
