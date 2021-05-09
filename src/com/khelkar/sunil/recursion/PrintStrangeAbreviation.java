package com.khelkar.sunil.recursion;

public class PrintStrangeAbreviation {

	public static void main(String[] args) {
		
		String input = "pep";
		
		printStrangeAbreviation(input, 0, "", 0);
		
	}

	private static void printStrangeAbreviation(String input, int count, String asf, int index) {
		
		if (index == input.length()) {
			if (count == 0) {
				System.out.println(asf);
			} else {
				System.out.println(asf + count);
			}
			return;
		}
		
		printStrangeAbreviation(input, count + 1, asf , index + 1); // when character said no for inclusion
		if (count > 0) {
			printStrangeAbreviation(input, 0, asf + count +  input.charAt(index) , index + 1); // YES
		} else {
			printStrangeAbreviation(input, 0, asf +  input.charAt(index) , index + 1); // YES

		}
		
		
	}
	
}
