package com.khelkar.sunil.DynamicProgramming;

public class hanoi {

	public static void main(String[] args) {
		
		hanoi("A", "B", "C", 3);
	}
	
	public static void hanoi(String source, String temp, String dest, int disc) {
		
		if (disc == 0) {
			return;
		} else if (disc == 1) {
//			System.out.println(source + " to " + dest);
//			return;
		}
		
		hanoi(source, dest, temp, disc-1);
		System.out.println(source + " to " + dest);
		hanoi(temp, source, dest, disc-1);
		
	}
	
}
