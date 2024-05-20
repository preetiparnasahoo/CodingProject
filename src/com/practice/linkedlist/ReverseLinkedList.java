package com.practice.linkedlist;
import com.practice.linkedlist.LinkedList.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = LinkedList.createLinkedList(); 
		
		Reverse(list);
		
		LinkedList.printLinkedList(list);

	}


	public static void Reverse(LinkedList list) {
		// TODO Auto-generated method stub
		Node curr = list.head;
		Node prev = null;
		Node fwd = null;
		
		while (curr != null) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		
		list.head = prev;
	}

}
