package com.khelkar.sunil.string;

import java.util.Arrays;

public class AnagaramSearch {

	// Anagram search means, any permutation of a sub-string is matches within the text.
	// geeksforgeek and frog -- yes
	
	public static void main(String[] args) {
		
		String txt = "geeksforgeek"; 
		int len = txt.length();
		
		String pat = "frog";
		int plen = pat.length();
		
		int[] arr = new int[255];
		
		for (int i =0 ; i < plen; i++  ) {
			arr[pat.charAt(i)] -- ;
			// at same time we can process one window of the txt 
			arr[txt.charAt(i)] ++ ;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(checkArray(arr, pat) ? "first matched" : "nope");
		
		for (int i= plen; i < len; i++) {
			arr[txt.charAt(i- plen)]--;
			arr[txt.charAt(i)]++;
			System.out.println(Arrays.toString(arr));
			System.out.println(checkArray(arr, pat) ? " matched " + (i-plen) : "nope");
		}
	}

	public static boolean checkArray(int[] arr, String pat) {
		int len = pat.length();

		// this is only helpful whe our pat is very small as compared to 255, otherwise we can use below commented code 
		for (int i=0; i < len; i++) {
			if (arr[pat.charAt(i)] != 0 ) {
				return false;
			}
		}
		
		return true;
		
		/**
		 * we could also check complete array from 1 to 255 if our string are much more larger than the 255
		 *
		 *for (int i=0; i < 255; i++) {
			if (arr[i] != 0 ) {
				return false;
			}
		}
		return true;
		 */	
	}
}
