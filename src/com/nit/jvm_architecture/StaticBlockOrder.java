package com.nit.jvm_architecture;

class Block
{
	static int x;
	
	static
	{
		x=100;
	}
	static
	{
		x=200;
	}
	static
	{
		System.out.println("x value : "+x);
	}
}

public class StaticBlockOrder {
	public static void main(String[] args) throws ClassNotFoundException {
//		Class.forName("Block");
		Block b=new Block();
	}
}
