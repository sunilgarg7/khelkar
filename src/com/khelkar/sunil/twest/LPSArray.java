package com.khelkar.sunil.twest;

public class LPSArray {

	
	public static void main(String[] args) {
		// we will be printing the LPS string along with printing all prefixes and all suffixes
		
		
		allPrefixPrint("abcdef");
	}
	
	
	public static void allPrefixPrint(String s) {
		int len = s.length();
		for (int i=0; i < len; i++ ) {
			System.out.println("length : " + i);
			System.out.println(s.substring(0, i));
			System.out.println(s.substring(len - i));
			
		}
	}
	
	public static void allSufixPrint(String s) {
		int len = s.length();
		for (int i=len; i > 0; i-- ) {
			System.out.println("length : " + i);
			System.out.println(s.substring(i-1, len));
		}
	}
	
}
