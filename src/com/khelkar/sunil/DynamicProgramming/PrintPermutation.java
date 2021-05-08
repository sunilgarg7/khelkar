package com.khelkar.sunil.DynamicProgramming;

public class PrintPermutation {

	
	public static void main(String[] args) {
		String str = "abcd";
		printPerm(str, "");

	}
	
	public static void printPerm(String str, String asf) {
		if ( 0 == str.length()) {
			System.out.println(asf);
			return;
		}
		for (int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			String qsf = str.substring(0, i) + str.substring(i+1);
			printPerm(qsf, asf + ch ); 
		}
	}
}
