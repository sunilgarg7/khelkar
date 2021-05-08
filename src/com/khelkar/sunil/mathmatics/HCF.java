package com.khelkar.sunil.mathmatics;

public class HCF {

	
	// Eulidean theorm
	// it says the HCF g of a and b  = g(a-b, b) (if b< a) or else  g(b-a, b)
	
	public static void main(String[] args) {
		
		int a = 15;
		int b = 5;
		
		while (a != b) {
			
			if (a> b) {
				a = a-b;
			} else 
				b= b-a;
		}
		
		System.out.println(a);
		System.out.println(othermethod(a, b));
	}
	
	private static int othermethod(int a, int b) {

		if (b == 0)
			return a;
		else 
			return othermethod(b, a%b);
		
	}
	
	
	
}
