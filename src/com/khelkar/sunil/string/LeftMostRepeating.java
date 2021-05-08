package com.khelkar.sunil.string;

import java.util.Arrays;

public class LeftMostRepeating {

	
	public static void main(String[] args) {
		// left most repeating character
		String str =  "abcgeksfork"; // answer is g
		int[] arr = new int[256];
		int rep = Integer.MAX_VALUE;
		
		for (int i= str.length()-1; i>=0; i--) {
			System.out.println(i);
			if (arr[str.charAt(i)] != 0) {
				rep = i;
			}
			arr[str.charAt(i)]++;
		}
		
		System.out.println(rep);
		System.out.println(Arrays.toString(arr));
	}
	
}
