package com.nit.Encapsulation;

 class Laptop 
{
	private String laptopBrand;
	private double laptopPrice;

	public Laptop(String laptopBrand, double laptopPrice)
	{
		super();
		this.laptopBrand = laptopBrand;
		this.laptopPrice = laptopPrice;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() 
	{
		return "Laptop [laptopBrand=" + laptopBrand + ", laptopPrice=" + laptopPrice + "]";
	}
}


public class ShallowCopyDemo {

	public static void main(String[] args) 
	{
		Laptop laptop1 = new Laptop("Acer", 60000);
		System.out.println(laptop1);
		
		Laptop laptop2 = laptop1;
		laptop2.setLaptopBrand("HP");
		laptop2.setLaptopPrice(80000);
		
		System.out.println(laptop1);
		System.out.println(laptop2);	
		
	}

}

/* Laptop [laptopBrand=Acer, laptopPrice=60000.0]
Laptop [laptopBrand=HP, laptopPrice=80000.0]
Laptop [laptopBrand=HP, laptopPrice=80000.0]
 */
