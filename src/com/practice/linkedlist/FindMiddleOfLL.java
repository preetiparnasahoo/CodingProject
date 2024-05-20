package com.practice.linkedlist;

import com.practice.linkedlist.LinkedList.Node;

public class FindMiddleOfLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList list = LinkedList.createLinkedList(); 
		
		Node mid = FindMiddle(list);
		
		LinkedList.printLinkedList(mid);

	}

	private static Node FindMiddle(LinkedList list) {
		
		if(list.head == null) {
			return list.head;
		}
		// TODO Auto-generated method stub
		Node fast = list.head;
		Node slow = list.head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}

}
