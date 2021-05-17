package com.khelkar.sunil.string;

public class FrequencyPrintingInStringCharacterAppearnceOrderWithoutDuplicates {
	public static void main(String[] args) {

		// printing frequency of the characters, without printing the duplicate
		// characters again and again
		String str = "acbdhsfoosdhfohoas";

		int[] freq = new int[255];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] != 0) {
				System.out.println("freq of char [ " + str.charAt(i) + " ] = " + freq[str.charAt(i)]);
				freq[str.charAt(i)] = 0;
			}
		}
	}
}
