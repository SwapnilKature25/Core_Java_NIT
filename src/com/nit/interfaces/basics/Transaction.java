package com.nit.interfaces.basics;

public interface Transaction {
	public static final Balance b=new Balance();  // Non-primitive type variable
	
	void process(int amt);
	
}
