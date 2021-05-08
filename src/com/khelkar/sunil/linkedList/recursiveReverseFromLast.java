package com.khelkar.sunil.linkedList;

public class recursiveReverseFromLast {

	
	public static void main(String[] args) {
		Node n = Node.list;
	//	System.out.println(Node.node5.toString());
	//	reverse(n, null);
	//	IterativeReverse(n);
		reverseFromLast(n);
		System.out.println(Node.node5.toString());
		
	}
	
	public static Node IterativeReverse(Node curr) {
		
		if (curr == null || curr.next == null) {
			return curr;
		}
		Node nex;
		Node prev= null;
		while (curr != null) {
			nex = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nex;
		}
		
		return prev;
		
	}
	
	public static Node reverseFromLast(Node curr) {
		if (curr == null || curr.next == null) {
			return curr;
		}
		Node next = curr.next;
		Node rest_head = reverseFromLast(next);
		Node newPrev = curr.next;
		newPrev.next = curr;
		curr.next = null;
		return rest_head;
	}
	
	public static Node reverse(Node curr, Node prev) {
		
		if (curr == null) {
			return prev;
		}
		Node next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		return reverse(curr, prev);
	}
}
