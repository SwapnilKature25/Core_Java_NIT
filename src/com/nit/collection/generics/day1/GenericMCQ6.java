package com.nit.collection.generics.day1;
 
class NareshIT3<K,V>
{
	private K key;
	private V value;
	//constructor
	public NareshIT3(K key, V value) {
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
public class GenericMCQ6 {
	public static void main(String[] args) {
		NareshIT3<String,String> nit = new NareshIT3("Naresh","IT");
		System.out.println(nit.getKey()+nit.getValue()); //NareshIT
		NareshIT3<Integer,String> integer = new NareshIT3(1003, "Naresh"); 
		System.out.println(integer.getKey());	 //1003
	}
}
