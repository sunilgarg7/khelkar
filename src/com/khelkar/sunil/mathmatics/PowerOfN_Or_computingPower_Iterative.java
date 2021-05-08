package com.khelkar.sunil.mathmatics;

public class PowerOfN_Or_computingPower_Iterative {

	public static void main(String[] args) {
		
		int x= 4; // actual number
		int n = 54; // power
		// output n power 54 result
		int temp = 1;
		
		
		System.out.println(power(2,9));
		
		
	}
	
	
	public static int power(int x, int n ) {
		int temp;
		if (n == 0) {
			return 1;
		}
		
		if (n%2 ==0) { 
			temp = power(x , n /2);
			return temp * temp;
		} else {
			return power(x, n-1) *x;
		}
		
		
		
		
	}
	
	
	
}
