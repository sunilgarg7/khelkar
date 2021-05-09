
package com.khelkar.sunil.string.recursive;

public class PrintAllStringPermutations {

	
	public static void main(String[] args) {
		
		String input = "abcd";
		
		
		printAllPermutaion(input, "", 0, input.length());
		
	}
	
	
	public static void printAllPermutaion(String input, String asf, int pos, int len) {
		if (pos == len) {
			System.out.println(asf);
		}
		
		for (int i=0; i<input.length(); i++) {
			String before= input.substring(0, i);
			String after = input.substring(i+1);
			
			printAllPermutaion(before+after, asf+input.charAt(i), pos+1, len);
			
			
		}
		
	}
	
}
