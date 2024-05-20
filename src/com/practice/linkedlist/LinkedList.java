package com.practice.linkedlist;

public class LinkedList {
	
	Node head; //Head of the list

	// Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void printLinkedList(LinkedList list) {

		Node curr = list.head;
		
		while (curr.next != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;

		}
		System.out.print(curr.data);
	}
	
	public static void printLinkedList(Node node) {

		Node curr = node;
		
		while (curr.next != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;

		}
		System.out.print(curr.data);
	}

	public static LinkedList insert(LinkedList list, int data) {
		
		Node d = new Node(data);
		
		if(list.head == null) {
			list.head = d;
		}
		
		else {
			Node curr = list.head;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = d;
			
		}
		return list;
	
	}
	
	
	public static void delete(LinkedList list, int deleteItem) {
		Node curr = list.head;
		Node prev = null;
		while( curr != null && curr.data != deleteItem) {
			prev = curr;
			curr = curr.next;
		}
		
		if (curr == null) return;
		prev.next = curr.next;
	}

	public static LinkedList createLinkedList() {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		insert(list, 10);
		insert(list, 20);
		insert(list, 30);
		insert(list, 40);
		insert(list, 50);
		
		return list;
	}
}
