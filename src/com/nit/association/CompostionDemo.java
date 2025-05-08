package com.nit.association;

class Engine 
{
	private String engineType;
	private int horsePower;

	public Engine(String engineType, int horsePower) 
	{
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	
	

}

 
 class Car {
	private String carName;
	private int carModel;
	private final Engine engine; // HAS-A Relation

	public Car(String carName, int carModel)
	{
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine = new Engine("Battery", 1200); // Composition
	}

	@Override
	public String toString() 
	{
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}

}
 

public class CompostionDemo  // Strong reference
{
	public static void main(String[] args) 
	{
		Car naxon = new Car("Tata Naxon", 2024);
		System.out.println(naxon);

	}

}