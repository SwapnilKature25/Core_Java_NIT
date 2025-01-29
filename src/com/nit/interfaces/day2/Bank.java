package com.nit.interfaces.day2;

// Question: Banking System with Loosely Coupled Architecture

//Bank Interface defining common banking operations
interface Bank {
 void deposit(double amount);
 void withdraw(double amount);
 double checkBalance();
}

//SBI Bank Implementation
class SBI implements Bank {
 private double accountBalance;

 public SBI(double initialBalance) {
     this.accountBalance = initialBalance;
 }

 public void deposit(double amount) {
     accountBalance += amount;
     System.out.println("Deposited ₹" + amount + " in SBI. New Balance: ₹" + accountBalance);
 }

 public void withdraw(double amount) {
     if (amount > accountBalance) {
         System.out.println("Insufficient balance in SBI.");
     } else {
         accountBalance -= amount;
         System.out.println("Withdrawn ₹" + amount + " from SBI. New Balance: ₹" + accountBalance);
     }
 }

 public double checkBalance() {
     return accountBalance;
 }
}

//HDFC Bank Implementation
class HDFC implements Bank {
 private double accountBalance;

 public HDFC(double initialBalance) {
     this.accountBalance = initialBalance;
 }

 public void deposit(double amount) {
     accountBalance += amount;
     System.out.println("Deposited ₹" + amount + " in HDFC. New Balance: ₹" + accountBalance);
 }

 public void withdraw(double amount) {
     if (amount > accountBalance) {
         System.out.println("Insufficient balance in HDFC.");
     } else {
         accountBalance -= amount;
         System.out.println("Withdrawn ₹" + amount + " from HDFC. New Balance: ₹" + accountBalance);
     }
 }

 public double checkBalance() {
     return accountBalance;
 }
}

//ICICI Bank Implementation
class ICICI implements Bank {
 private double accountBalance;

 public ICICI(double initialBalance) {
     this.accountBalance = initialBalance;
 }

 public void deposit(double amount) {
     accountBalance += amount;
     System.out.println("Deposited ₹" + amount + " in ICICI. New Balance: ₹" + accountBalance);
 }

 public void withdraw(double amount) {
     if (amount > accountBalance) {
         System.out.println("Insufficient balance in ICICI.");
     } else {
         accountBalance -= amount;
         System.out.println("Withdrawn ₹" + amount + " from ICICI. New Balance: ₹" + accountBalance);
     }
 }

 public double checkBalance() {
     return accountBalance;
 }
}
