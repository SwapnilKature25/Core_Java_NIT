package com.nit.multithreading.itc;


record Product(Integer productId)
{
	@Override
	public void finalize()
	{
		System.out.println("Product Object is eligible for GC");
	}
}
public class FinalizeDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
        Product p1 = new Product(111);
        System.out.println(p1);
        
        p1 = null;
        
        System.gc(); //Explicitly calling GC
        
        Thread.sleep(3000);
        
        System.out.println(p1);

	}

}