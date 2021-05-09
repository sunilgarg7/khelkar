package com.khelkar.sunil.string.recursive;

public class Permutation {

	public static void main(String[] args) {
		char[] str = { 'A', 'B', 'C', 'D'};
		
		permutation(str, "", 0);
	}

	private static void permutation(char[] str, String cur, int fixLoc) {
		if (fixLoc == str.length) {
			System.out.println(cur);
			return;
		}
		
		for (int i=fixLoc; i < str.length; i++) {
			swap(str, i, fixLoc);
			permutation(str, cur + str[i], fixLoc + 1);
			swap(str, fixLoc, i);
		}
		
	}
	
	public static void swap(char[] str, int a, int b) {
		char temp = str[a];
		str[a] = str [b];
		str[b] = temp;
	}
	
}
