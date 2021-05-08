package com.khelkar.sunil.recursion;


public class RopeCutMax {

	public static void main(String[] args) {
		
		int len = 23;
		int a = 11;
		int b = 9;
		int c = 12;
		
		System.err.println(maxRopeCut(len, a, b, c));
		
		
	}
	
	public static int maxRopeCut(int len, int a, int b , int c) {
		if (len == 0) {
			return 0;
		} else if (len < 0) {
			// no proper cut in this sub tree
			return -1;//Integer.MIN_VALUE;
		}
		
	int res =Math.max( maxRopeCut(len-a, a, b, c), Math.max( maxRopeCut(len-b, a, b, c), maxRopeCut(len-c, a, b, c)));
		
	if (res == -1) {
		return -1;
	}else 
		return res + 1;
	}
	
}
