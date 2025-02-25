package com.nit.collection.generics;

class Basket<E> {
	private E element;

	public Basket(E element) // Fruit element = new Apple();
	{
		super();
		this.element = element;
	}

	public E getElement() {
		return element;
	}
}

class Fruit {

}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple []";
	}

}

class Orange extends Fruit {

	@Override
	public String toString() {
		return "Orange []";
	}

}

public class WildCardDemo7 {
	public static void main(String[] args) {
		Basket<Fruit> basket = new Basket<>(new Apple());
		Apple apple = (Apple) basket.getElement();
		System.out.println(apple);

		basket = new Basket<>(new Orange());
		Orange orange = (Orange) basket.getElement();
		System.out.println(orange);

	}
}