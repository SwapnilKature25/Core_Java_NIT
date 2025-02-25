package com.nit.collection.generics.day1;

class NareshIT5<K extends Number ,V extends String>
{
	private K key;
	private V value;
		
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

public class GenericMCQ8 {
	public static void main(String[] args) {
		NareshIT5<Integer, String> nit = new NareshIT5();
		nit.set(9999, new String("Naresh I Technologies"));
		System.out.println(nit.getKey()+" "+nit.getValue());  // 9999 Naresh I Technologies
	
	}
}
