package com.nit.interfaces;

 interface HotDrink 
{
    void prepare();
}


 class Tea implements HotDrink
{
	@Override
	public void prepare()
	{
	  System.out.println("Preparing Tea");	
	}

}

 class Coffee implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Preparing Coffee");

	}

}


 class Horlicks implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Preparing Horlicks");

	}

}

class Restaurant 
{
   public static void acceptObject(HotDrink hd)  
   {
	  hd.prepare(); 
   }
}


public class LooseCoupling 
{
	public static void main(String[] args) 
	{
		Restaurant.acceptObject(new Tea());
		Restaurant.acceptObject(new Coffee());
        Restaurant.acceptObject(new Horlicks());
	}

}
