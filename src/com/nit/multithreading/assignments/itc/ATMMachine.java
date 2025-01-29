package com.nit.multithreading.assignments.itc;

public class ATMMachine {
	public static void main(String[] args) {
		Account acc=new Account();
		Depositer dp=new Depositer(acc);
		dp.start();
		WithDrawer wt=new WithDrawer(acc);
		wt.start();
	}
}


/* 10000 Successfully Deposited | Total Balance : 10000
5000 Successfully withdrawn | Remaining Balance : 5000
2000 Successfully withdrawn | Remaining Balance : 3000
2000 Successfully Deposited | Total Balance : 5000
1000 Successfully withdrawn | Remaining Balance : 4000
5000 Successfully Deposited | Total Balance : 9000
 */