package com.khelkar.sunil.mathmatics;

public class NoOfBits {

	public static void main(String[] args) {
		int n = 0;
		int c =0 ;
		while (n>0) {
			c++;
			n = n >> 1;
		}
		
		System.out.println(c);
	}
	
}
