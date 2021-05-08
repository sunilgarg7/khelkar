package com.khelkar.sunil.linkedList;

public class ReverseKnodes {

	public static void main(String[] args) {
		Node n = Node.list;
		
		System.out.println(Node.node5.toString());
	}
	
	
	public static void reverseKnodes(Node start, int k) {
		
		boolean isfirst = true;
		Node head, prevHead;
		if (start == null || start.next == null) {
			return;
		}
		Node curr = start;// so that we dont loose start
		Node next, prev = null;
		
		while (curr != null) {
			start = curr;
			for (int i=0; i<k && curr != null; i++) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
 			}
			
			if (isfirst) {
				head = prev;
				isfirst = false; 
			} else {
				
			}
			
		}
		
		
	}
	
}
