package com.khelkar.sunil.brackets;

import java.util.Stack;

public class DuplicateBrackets {

// whether the expression has un-required parentheses or not	
	public static void main(String[] args) {
		String str = "(((a+b)+(b+c))) ";
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == ')') {
				if (stack.peek() == '(' ){ // || stack.peek() == '[' || stack.peek() == '{' ) {
					// then we have duplicate bracket because we are closing without popping anything
					System.out.println("Duplicate hai bhai, Duplicate !!");
					return;
				} else {
					// now first character is not opening braces so we pop until we get one.
					while (stack.peek() != '(') {
						stack.pop();
					}
				}
			} else {
				stack.push(ch);
			}
			
		}
		
		System.out.println("No duplicate found");
	}
}
