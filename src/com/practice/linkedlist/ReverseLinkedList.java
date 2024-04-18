package com.practice.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = Node.createLinkedList(); 
		
		head = Reverse(head);
		
		Node.printLinkedList(head);

	}


	public static Node Reverse(Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		Node prev = null;
		Node fwd = null;
		
		while (curr != null) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		
		return prev;
	}

}
