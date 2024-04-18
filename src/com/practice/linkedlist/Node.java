package com.practice.linkedlist;

public class Node{
	
	int data;
	Node next = null;
	
	Node(int data){
		this.data = data;
	}
	
	public static void printLinkedList(Node head){
		
		Node node =  head;
		while(node.next != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
			
		}
		System.out.print(node.data);
	}
	
	public static Node createLinkedList() {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		return head;
	}
}
