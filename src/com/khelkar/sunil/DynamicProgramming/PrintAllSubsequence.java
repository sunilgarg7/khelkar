package com.khelkar.sunil.DynamicProgramming;

public class PrintAllSubsequence {

	public static void main(String[] args) {
		String str = "abed";
		printSubsequence(str, 0, "");
	}
	
	public static void printSubsequence(String str, int index, String asf) {
		
		if (index == str.length()) {
			System.out.println(asf);
			return;
		}
		 char ch = str.charAt(index);
		printSubsequence(str, index + 1, asf + ch);
		printSubsequence(str, index + 1, asf + " ");

		
	}
	
}
