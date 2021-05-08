package com.khelkar.sunil.tree.traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class TreePrintingMirror {
	
	static class Node {
		int data;
		ArrayList<Node> child = new ArrayList<>();
		
		public Node(int data) {
			this.data = data;
		}
		
		public void addChild(Node n) {
			child.add(n);
		}
		
		public ArrayList<Node> getChilds() {
			return child;
		}
		
		@Override
		public String toString() {
			return data + "";
		}
		
	}
	
	public static Node linearize2(Node root) {
		Node last = root;
		
		for (Node child : root.child) {
			last.child = new ArrayList<>();
			last.child.add(child);
			last = linearize2(child);
		}
		
		return last;
	}
	
	

	public static void main(String[] args) {
		int[] arr =  {10 , 20, 50, -1 , 60, -1, -1, 30, 70, -1, 80, 110, -1, 120,
					 -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		Node root = null;
		Stack<Node> st = new Stack<>();
		
		for (int i =0; i < arr.length; i++ ) {
			if (arr[i] == -1) {
				st.pop(); // if negative test cases is to be tested then we need to check before popping
			} else {
				Node n = new Node(arr[i]);
				if (st.size() != 0) {
					st.peek().addChild(n);
				} else {
					root = n; // again negative test case could be, we already have a root set.
				}
				st.push(n);
			}
		}
		
		System.out.println(printDFSTree(root));
		linearize2(root);
		System.out.println(printDFSTree(root));
	}
	
	public static Node linearizeTree(Node root) {
		
		Node last = root;
		for (Node child : root.child) {
			last.child = new ArrayList<>();
			last.child.add( child ); 
			last = linearizeTree(child);
		}
		
		return last;
	}
	
	public static void mirror(Node root) {
		
		for (Node child : root.child) {
			mirror(child);
		}
		
		Collections.reverse(root.child);
	}
	
	public static void removeLeaf(Node root) {
		
		Iterator<Node> itr = root.child.iterator();
		
		while (itr.hasNext()) {
			Node child = itr.next();
			if (child.child.size() == 0) {
				// leaf node
				itr.remove();
			} else {
				removeLeaf(child);
			}
		}
		
	}
	
	
	public static String printDFSTree(Node root) {
		String str = "" ;
 		if (root == null) {
			return -1 + " "; // Code actually never reached here, because arrayList will be empty for leaf nodes.
		}
		
		System.out.println(root.data + " -> " + root.getChilds().toString());
		for (Node n : root.getChilds()) {
			//str += n.data + " ";
			str += printDFSTree(n);
		}
		
		return str;
	}
}
