package com.khelkar.sunil.DynamicProgramming;

public class recursion {

	
	public static void main(String[] args) {
		rec(2  );
	}
	
	public static void rec(int n ) {
		if (n == 0) {
			return ;
		}
		
		System.out.println("pre " + n);
		rec(n-1);
		System.out.println("in " + n);
		rec(n-1);
		System.out.println("post " + n);
		//rec(n-1);
	}
}
