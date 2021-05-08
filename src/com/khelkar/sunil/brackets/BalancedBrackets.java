package com.khelkar.sunil.brackets;

import java.util.Stack;

public class BalancedBrackets {

// whether the expression has all types of balanced brackets or not	
	public static void main(String[] args) {
		String str = "(((a+b)+(b+c))) ";
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == '}' || ch == ')' || ch == ']') {
				if (ch == '}') {
					if (stack.size() == 0 || stack.peek() != '{') {
						System.out.println("not equal");
						return;
					}
					stack.pop(); // dont forget this .
				}
				
			}else if (ch == '(' || ch == '{' || ch == '['){
				stack.push(ch);
			} else { // for any other item we dont care
			//	stack.push(ch);
			}
			
			if (!stack.empty()) {
				System.out.println("un-ballanced");
			}
			
		}
		
		System.out.println("No duplicate found");
	}
}
