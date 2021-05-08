package com.khelkar.sunil.tree.basics;

import java.util.ArrayList;
import java.util.Stack;

public class TreePrintingWithPOSTandPreOfAllChilds {
	
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

	public static void main(String[] args) {
		int[] arr =  {10 , 20, -1 , 30, 50, -1, 60, -1, -1, 40, -1, -1};
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
	}
	
	public static String printDFSTree(Node root) {
		String str = "" ;
 		if (root == null) {
			return -1 + " "; // Code actually never reached here, because arrayList will be empty for leaf nodes.
		}
		
		System.out.println("Node Pre- " + root.data);
		for (Node n : root.getChilds()) {
			//str += n.data + " ";
			System.out.println("Edge Pre- " + root.data + "==" + n.data );
			str += printDFSTree(n);
			System.out.println("Edge POST- " + root.data + "==" + n.data );
		}
		System.out.println("Node POST - " + root.data);
		
		return str;
	}
}
