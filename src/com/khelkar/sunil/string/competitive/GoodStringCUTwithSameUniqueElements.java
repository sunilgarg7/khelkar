package com.khelkar.sunil.string.competitive;

import java.util.TreeSet;

public class GoodStringCUTwithSameUniqueElements {
	// https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
	/**
	 * You are given a string s, a split is called good if you can split s into 2 non-empty strings p and q where its 
	 * concatenation is equal to s and the number of distinct letters in p and q are the same.
	 * 
	 * Return the number of good splits you can make in s.
	 */
	public static void main(String[] args) {
		
		String str = "aacaba" ;
		
		TreeSet<String> st= new TreeSet<>();
		st.ceiling(str);
		
		getMaxCutWithSameUniqueElements(str);
		
		
		
	}

	private static void getMaxCutWithSameUniqueElements(String str) {
		
		boolean[] left = new boolean[255];
		boolean[] right = new boolean[255];
		
	//	for (int i=0; i< )
		
		
	}
	
	
	
	
}
