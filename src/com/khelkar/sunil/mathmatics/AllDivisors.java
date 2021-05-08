package com.khelkar.sunil.mathmatics;

public class AllDivisors {

	public static void main(String[] args) {
		
		int n = 30;
		
		String str = "ada";
		//str.equals(arg0)
		
		int i =1;
		for (;  i*i < n;  i++) {
			if (n%i == 0) {
				System.out.println(i);
			}
		}
		System.out.println("----");
		int temp;
		for (; i>=1; i-- ) {
			if (n%i ==0) {
				
				System.out.println(n/i);
			}
					
		}
		
		
		
	}
	
	
}


