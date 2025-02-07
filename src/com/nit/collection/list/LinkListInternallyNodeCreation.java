package com.nit.collection.list;


public class LinkListInternallyNodeCreation {
	
	static class Node
	{
		int item;
		Node next;
		
		public Node(int item)
		{
			this.item=item;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		Node n1=new Node(100);
		Node n2=new Node(200);
		Node n3=new Node(300);
		
		n1.next=n2;
		n2.next=n3;
		
		System.out.println(n1.item);   // 100
		System.out.println(n1.next.item); // 200
		System.out.println(n1.next.next.item); // 300
		
	}
}
