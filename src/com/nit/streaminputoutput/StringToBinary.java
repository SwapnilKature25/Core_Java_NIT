package com.nit.streaminputoutput;

//Program that describes how to convert String data into binary :

public class StringToBinary {

	public static void main(String[] args) 
	{
		 String str = "ABC DEF";
		 
		 byte[] byt=str.getBytes();
		 
		 for(byte data : byt)
		 {
			 System.out.print((char)data);
		 }
	}

}