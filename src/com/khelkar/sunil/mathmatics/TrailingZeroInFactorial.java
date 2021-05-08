package com.khelkar.sunil.mathmatics;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		
		int n = 251;
		int count = 0;
		
		for (int i = 5; i <= n ; i = i*5) {
			count +=  (int)(n/i);
		}
		 
		System.out.println(count);
	}
	
	
}
