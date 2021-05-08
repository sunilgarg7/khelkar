package com.khelkar.sunil.linkedList;


public class Node {
	
	public static Node list = new Node(10);
	public static Node node2, node3, node4, node5; 
	static {
		 node2 = list.add(20);
		 node3 = node2.add(30);
		 node4 = node3.add(40);
		 node5 = node4.add(50);
		System.out.println("from Node class: " + list.toString()); 
	}
	
	public int data;
	public Node next;
	
	public Node(int i) {
		data = i;
	}
	
	public Node add(int i) {
		Node n =  new Node(i);
		this.next = n;
		return n;
	}
	
	@Override
	public String toString() {
		String str = "";
		Node n = this;
		while (n != null ) {
			str +=  n.data + "," ;
			n = n.next;
		}
		return str;
	}
	
	
	public static void main(String[] args) {
	//	Node list = new Node(10);
	//	list.add(20).add(30).add(40).add(50);
    // System.out.println(list.toString());
	}
	
	
	
	
}
