package com.khelkar.sunil.mathmatics;

public class PowerOfN_Or_computingPower {

	public static void main(String[] args) {
		
		int x= 2; // actual number
		int n = 8; // power
		// output n power 54 result
		int mult = x;
		int res = 1;
		while (n > 0) {
			if ((n & (1<<0) ) != 0 ) {
				res *= mult;
			}
			mult *= mult ;
			n >>= 1;	
		}
		System.out.println(res);
	}
}
