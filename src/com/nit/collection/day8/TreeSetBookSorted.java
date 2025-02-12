package com.nit.collection.day8;

import java.util.Collections;
import java.util.TreeSet;

record Book(String name, String author) implements Comparable<Book>
{

	@Override
	public int compareTo(Book b2) {
		return this.name.compareTo(b2.name);
	}
	
}

public class TreeSetBookSorted {
	public static void main(String[] args) {
		TreeSet<Book> books=new TreeSet<>();
		books.add(new Book("java","James"));
		books.add(new Book("c", "cameron"));
		books.add(new Book("python","Jame"));
		
		System.out.println(books);
	}
}
