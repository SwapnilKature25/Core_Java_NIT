package com.nit.multithreading.practice.test2;

public class ATM {
	public static void main(String[] args) {
		Account acc=new Account();
		
		Depsiter dep=new Depsiter(acc);
		dep.start();
		Withdrawer wtd=new Withdrawer(acc);
		wtd.start();
	}
}
